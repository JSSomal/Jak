package frameworkGlobals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import interfaces.DriverActions;

public class ById extends InitializeDriver implements DriverActions{
	
	 /**<h1>  click     </h1>
	 * {@code public void click(String selector, String actionInfo)}<br>
	   * This method performs click on the 'selector' element.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element to Click.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void click(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			element.click();
			System.out.println("Clicked Successfully: "+actionInfo);
			//extentTest.log(LogStatus.INFO, "Clicked Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Click: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
		    throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Click : "+actionInfo+" (ID: "+selector+")");
		}		
	}

	 /***<h1>  selectByIndex     </h1>
	 * {@code public void selectByIndex(String selector, int index, String actionInfo)}<br>
	   * This method select the option from selector dropdown element by index value of dropdown option.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element to Click.
	   * @param index: index value of selected dropdown option.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void selectByIndex(String selector, int index, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			Select select = new Select(element);
			select.selectByIndex(index);
			System.out.println("Selected Successfully: "+actionInfo);
	//		extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (ID: "+selector+")");
		}
	}
	
	/**<h1>  selectByValue     </h1>
	 * {@code public void selectByValue(String selector, String value, String actionInfo)}<br>
	   * This method select the option from selector dropdown element by value of dropdown option.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element to Click.
	   * @param value: value of selected dropdown option.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void selectByValue(String selector, String value, String actionInfo) {
		try {
			WebElement element = driver.findElement(By.id(selector));
			Select select = new Select(element);
			select.selectByValue(value);
			System.out.println("Selected Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (ID: "+selector+")");
		}		
	}

	/**<h1>  selectByVisibleText     </h1>
	 * {@code public void selectByVisibleText(String selector, String text, String actionInfo)}<br>
	   * This method select the option from selector dropdown element by visible text of dropdown option.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element to Click.
	   * @param text: visible text of selected dropdown option.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void selectByVisibleText(String selector, String text, String actionInfo) {
		try {
			WebElement element = driver.findElement(By.id(selector));
			Select select = new Select(element);
			select.selectByVisibleText(text);
			System.out.println("Selected Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Selected Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Select: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Select : "+actionInfo+" (ID: "+selector+")");
		}		
	}

	/**<h1>  getClass     </h1>
	 * {@code public String getClass(String selector, String actionInfo)}<br>
	   * This method returns the class name of 'selector' element.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element to Get Class.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return String clasNname of 'selector'.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getClass(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String className = null;
		try {
			WebElement element = driver.findElement(By.id(selector));
			className = element.getAttribute("class");
			System.out.println("Got Class Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Got Class Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get Class: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Class : "+actionInfo+" (ID: "+selector+")");
		}
		return className;
	}

	/**<h1>  getFirstSelectedOption     </h1>
	 * {@code public String getFirstSelectedOption(String selector, String actionInfo)}<br>
	   * This method get selected option name of the dropdown selector element.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return name of selected option of dropdown selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getFirstSelectedOption(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		String firstSelectedoption = null;
		try {
			WebElement element = driver.findElement(By.id(selector));
			Select select = new Select(element);
			WebElement option = select.getFirstSelectedOption();
			firstSelectedoption = option.getText();	
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get : "+actionInfo+" (ID: "+selector+")");
		}
		
		return firstSelectedoption;
	}
	
	/**<h1>  getOptions     </h1>
	 * {@code public List<String> getOptions(String selector, String actionInfo)}<br>
	   * This method get list of all options names of the dropdown selector element.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return list of all options names of dropdown selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public List<String> getOptions(String selector, String actionInfo) {
		List<String> allOptions = new ArrayList<>();
		try {
			WebElement element = driver.findElement(By.id(selector));
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			for(int i=0; i<options.size(); i++) {
				allOptions.add(options.get(i).getText());
			}
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get : "+actionInfo+" (ID: "+selector+")");
		}
		
		return allOptions;
	}
	
	/**<h1>  getSize     </h1>
	 * {@code public int getSize(String selector, String actionInfo)}<br>
	   * This method get size of selector element.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return size value of selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public int getSize(String selector, String actionInfo) {
		int listSize;
		try {
			/*WebElement element = driver().findElement(By.id(selector));
			new JSExecutor().highlightElement(element);*/
			List<WebElement> options = driver.findElements(By.id(selector));
			listSize=options.size();
		    System.out.println("Getting Successfully: "+actionInfo);
		 //   extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
	    	throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Size : "+actionInfo+" (ID: "+selector+")");
		}		
		return listSize;
	}
	
	/**<h1>  getAttribute     </h1>
	 * {@code public String getAttribute(String selector, String attribute, String actionInfo)}<br>
	   * This method get attribute value of selector element's attribute.
	   * ID of elements should be pass as argument selector.
	   * attribute name should be pass as attribute
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param attribute: name of the attribute whose value need to get
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return value of given attribute of selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getAttribute(String selector, String attribute, String actionInfo) {
		String attributeValue;
		try {
			WebElement element = driver.findElement(By.id(selector));
			attributeValue = element.getAttribute(attribute);
		    System.out.println("Getting Successfully: "+actionInfo);
		    extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Attribute : "+actionInfo+" (ID: "+selector+")");
		}
		
		return attributeValue;
	}
	
	/**<h1>  getText     </h1>
	 * {@code public String getText(String selector, String actionInfo)}<br>
	   * This method get text of selector element.
	   * ID of elements should be pass as argument selector.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return It will return text selector element.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getText(String selector, String actionInfo) {
		String textValue;
		try {
			WebElement element = driver.findElement(By.id(selector));
			textValue = element.getText();
			System.out.println("Getting Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Getting Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to Get: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Text : "+actionInfo+" (ID: "+selector+")");
		}		
		return textValue;
	}
	
	/**<h1>  setText     </h1>
	 * {@code public void setText(String selector, String inputText, String actionInfo)}<br>
	   * This method enter text for selector element.
	   * ID of elements should be pass as argument selector.
	   * Input text of element should be pass as argument inputText.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param inputText: text that needs to enter into the selector element.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void setText(String selector, String inputText, String actionInfo) {
		try {
			WebElement element = driver.findElement(By.id(selector));
			 element.sendKeys(inputText);	
			System.out.println("Text entered Successfully: "+actionInfo);
			//extentTest.log(LogStatus.INFO, "Text entered Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to enter text: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to enter text : "+actionInfo+" (ID: "+selector+")");
		}		
	}

	/**<h1>  clearThenSetText     </h1>
	 * {@code public void clearThenSetText(String selector, String inputText, String actionInfo)}<br>
	   * This method will first clear the entered text then enter the passes text for selector element.
	   * ID of elements should be pass as argument selector.
	   * Input text of element should be pass as argument inputText.
	   * Information of action should be pass as argument actionInfo.
	   * @param selector: ID of element for which class need to get.
	   * @param inputText: text that needs to enter into the selector element.
	   * @param actionInfo: This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void clearThenSetText(String selector, String inputText, String actionInfo) {
		try {

			WebElement element = driver.findElement(By.id(selector));
			element.clear();
			element.sendKeys(inputText);	
			System.out.println("Text entered Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Text entered Successfully: "+actionInfo);
		} catch (Exception e) {
			System.out.println("Not able to enter text: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to enter text : "+actionInfo+" (ID: "+selector+")");
		}		
	}

	/**<h1>  getTagName     </h1>
	 * {@code public String getTagName(String selector, String actionInfo)}<br>
	   * This method returns the tag name of 'selector' element.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element to Get tag name.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return String tagName of the 'selector'.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public String getTagName(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			System.out.println("Get Tag Name Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Tag Name Successfully: "+actionInfo);
			return element.getTagName();
			
		} catch (Exception e) {
			System.out.println("Not able to Get Tag Name Successfully: "+actionInfo);
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Tag Name : "+actionInfo+" (ID: "+selector+")");
		}
	}

	/** <h1>  isDisplayed     </h1>
	 * {@code public boolean isDisplayed(String selector, String actionInfo)}<br>
	   * This method returns whether the 'selector' element is displayed or not.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return True if 'selector' element is displayed otherwise False.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public boolean isDisplayed(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			System.out.println("Get Displayed State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Displayed State Successfully: "+actionInfo);
			return element.isDisplayed();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Displayed State: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Displayed State : "+actionInfo+" (ID: "+selector+")");
		}
	}

	/** <h1>  isEnabled     </h1>
	 * {@code public boolean isEnabled(String selector, String actionInfo)}<br>
	   * This method returns whether the 'selector' element is displayed or not.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return True if 'selector' element is Enabled otherwise False.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public boolean isEnabled(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			System.out.println("Get Enabled State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Enabled State Successfully: "+actionInfo);
			return element.isEnabled();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Enabled State: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Enabled State : "+actionInfo+" (ID: "+selector+")");
		}
	}

	/** <h1>  isSelected     </h1>
	 * {@code public boolean isSelected(String selector, String actionInfo)}<br>
	   * This method returns whether the 'selector' element is Selected or not.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return True if 'selector' element is Selected otherwise False.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public boolean isSelected(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			System.out.println("Get Selected State Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Selected State Successfully: "+actionInfo);
			return element.isSelected();
		
		} catch (Exception e) {
			System.out.println("Not able to Get Selected State: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Selected State : "+actionInfo+" (ID: "+selector+")");
		}
	}

	/** <h1>  clear     </h1>
	 * {@code public void clear(String selector, String actionInfo)}<br>
	   * This method clear the 'selector' textBox.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void clear(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			element.clear();
			System.out.println("Cleared Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Cleared Successfully: "+actionInfo);
			
		} catch (Exception e) {
			System.out.println("Not able to Clear: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Clear : "+actionInfo+" (ID: "+selector+")");
		}
	}

	/** <h1>  setMultibleText     </h1>
	 * {@code public void setMultibleText(String urlPath,
	 *  String[] selectorArray, String[] textArray, String actionInfo)}<br>
	   * This method enters texts in multiple TextBoxes.
	   * URl of page where elements textboxes are present should be passed as argument urlPath
	   * Array of elements should be pass as argument '[]selectorArray'.
	   * Array of texts should be pass as argument '[]textArray'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param urlPath URl of Page. Could be null.
	   * @param selectorArray ID Array of elements.
	   * @param textArray  Texts Array to enter.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public void setMultipleText(String urlPath, String[] selectorArray, String[] textArray, String actionInfo) {
		// TODO Auto-generated method stub
		/**
		 * Make Sure The Text Values are same order as ID values. Also the data Type
		 * should accurate
		 */
		if (!(urlPath == null))
			driver.get(urlPath);
		if (selectorArray.length == textArray.length) {
			byte i = 0;
			try {
				for (String st : selectorArray) {
					Thread.sleep(100);
					clearThenSetText(st, textArray[i], actionInfo);
					i++;
				}
				Thread.sleep(500);
			} catch (InterruptedException e) {				
				// TODO: handle exception
			}
		} else {
			System.out.println("Size of selectorArray is not equal to textArray");
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Size of 'selectorArray' is not equal to 'textArray' : "+actionInfo);
		}		
	}

	/** <h1>  getElement     </h1>
	 * {@code public WebElement getElement(String selector, String actionInfo)}<br>
	   * This method returns WebElement of 'selector'.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return WebElement object.
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public WebElement getElement(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(By.id(selector));
			System.out.println("Get Element Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			return element;
		
			//log1.info("");
		} catch (Exception e) {
			System.out.println("Not able to Get Element: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Element : "+actionInfo+" (ID: "+selector+")");
			
		}		
	}

	/** <h1>  getElements     </h1>
	 * {@code public List<WebElement> getElements(String selector, String actionInfo)}<br>
	   * This method returns List of WebElement of 'selector'.
	   * ID of elements should be pass as argument 'selector'.
	   * Information of action should be pass as argument 'actionInfo'
	   * @param selector ID of element.
	   * @param actionInfo This parameter is information of action will show in Console/ScreenShot name/Logs
	   * @return List<WebElement> (list of WebElement objects).
	   * @throws RuntimeException if any exception is occur
	   */
	@Override
	public List<WebElement> getElements(String selector, String actionInfo) {
		// TODO Auto-generated method stub
		List<WebElement> elementList = null;
		try {
			elementList = driver.findElements(By.id(selector));
			System.out.println("Get Elements Successfully: "+actionInfo);
			extentTest.log(LogStatus.INFO, "Get Element Successfully: "+actionInfo);
			
		} catch (Exception e) {
			System.out.println("Not able to Get Elements: "+actionInfo+" (ID: "+selector+")");
			utility.takeScreenshot(actionInfo.replaceAll(" ", "_"));
			throw new java.lang.RuntimeException("RUNTIME_ERROR : : Not able to Get Elements : "+actionInfo+" (ID: "+selector+")");
		}
		return elementList;
	}

}
