package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import frameworkGlobals.InitializeDriver;

public class JSExecutor extends InitializeDriver {
	// assuming JS is enabled
	private JavascriptExecutor js = (JavascriptExecutor) driver;
	private static WebElement lastElem = null;
	private String lastBorder = null;
	private static final String setBorder = "color: red; border: 2px solid red;";
	private static final String removeBorder = "0px";

	public void highlightElement(WebElement elem) {

		unhighlightLast();

		// remember the new element
		lastElem = elem;

		// Set element border
		lastBorder = (String) (js.executeScript("arguments[0].setAttribute('style', arguments[1]);", elem, setBorder));
	}

	private void unhighlightLast() {
		if (lastElem != null) {
			try {
				// if there already is a highlighted element, Un-highlight it
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);", lastElem, removeBorder);
			} catch (StaleElementReferenceException e) {
				// the page got reloaded, the element isn't there
				e.printStackTrace();
			} catch (Exception e) {
				// the page got reloaded, the element isn't there
				// e.printStackTrace();
			} finally {
				// element either restored or wasn't valid, nullify in both
				// cases
				lastElem = null;
			}
		}
	}

}