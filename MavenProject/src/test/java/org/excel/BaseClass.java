package org.excel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
      
	public static void browserlaunch(String Url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(Url);
	}
	public static WebElement findelementid(String id) 
	{
		WebElement Element = driver.findElement(By.id(id));
		return Element;
		}
	public static void sendvalues(WebElement element,String value) {
		element.sendKeys(value);
	}
		//2.Drag and drop
		public void draganddrop(WebElement source, WebElement target) {
			Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		}
		//3.Right click
		public void rightclick(WebElement element) {
			Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
		}
		
		//4.accept Alert from UI
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		//5 xpath
	        public WebElement findxpath(String xpath) {
			WebElement element = driver.findElement(By.xpath("//input[@data-test-id ='royal-email']"));
			return element;
		}
			//6 Drop down
			public void selectbyvisibletext(WebElement element,String text) {
				Select select = new Select(element);
				select.selectByVisibleText(text);
			}
			// 7 insert values using Java script
			public void insertvalue(String value,WebElement element) {
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].setAttribute('value','bala')",element);
}
			//8.get the values using javascript
			public Object getvalue(String value,WebElement element) {
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				Object executeScript = executor.executeScript("returnarguments[0].getAttribute('value')",element);
				return executeScript;
				}
			// 9.click using JavaScript
			public void click(WebElement element) {
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()",element);
				}
			//10.Window Handling parent window
			public String getparentWindowid() {
				return driver.getWindowHandle();
			}
		//	11.Window Handling all window
			public Set<String> allwindowid() {
				return driver.getWindowHandles();
				}
			
			//12.Double click
			public void doubleclick(WebElement element) {
			Actions actions = new Actions(driver);
            actions.doubleClick(element).perform();
			}
			//13.To scroll down
			public void scrolldown(String value,WebElement element) {
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].Scroll Into view(true)",element);
			}
			//14.To Scroll up
			public void scrollup(String value,WebElement element) {
				JavascriptExecutor executor =(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].Scroll Into view(false)",element);
			}
			//15.Excel write
		public String excelwrite(String sheetName,String Pathname,int rowNo,int cellNo) throws IOException {
			String data = null;
			File file =new File(Pathname);
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet  = workbook.createSheet(sheetName);
			Row row = sheet.createRow(rowNo);
			Cell cell = row.createCell(cellNo);
			cell.setCellValue("Framework class");
			FileOutputStream Output = new FileOutputStream(file);
			workbook.write(Output);
			return data;
		}
		//16.ScreenShot
		public void Screenshot(String PathName) throws IOException {
			TakesScreenshot screenshot =(TakesScreenshot)driver;
			File src = screenshot.getScreenshotAs(OutputType.FILE);
			File des = new File(PathName);
			FileUtils.copyFile(src, des);
		}
		//17.Select by Index Dropdown
		public void selectbyindex(WebElement element,int indexNo) {
			Select select = new Select(element);
			select.selectByIndex(indexNo);
		}
		//18.Select by value
		public void selectbyvalue(WebElement element,String value) {
			Select select = new Select(element);
			select.selectByVisibleText(value);
			}
		//19.To get all options from the drop down
		public List<WebElement>getalloptions(WebElement element) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			return options;
					}
		//20.get first selected options
			public WebElement getfirstselectedoptions(WebElement element) {
				Select select = new Select(element);
				WebElement firstSelectedOption = select.getFirstSelectedOption();
				return firstSelectedOption;
			}
			//21.Deselect by Index
			public void deselectbyindex(WebElement element,int indexNo) {
				Select select = new Select(element);
				select.deselectByIndex(indexNo);
			}
			//22.Deselect by value
			public void deselectbyvalue(WebElement element,String value) {
				Select select = new Select(element);
				select.deselectByValue(value);
				}
			//23.Deselect by visible text
			public void deselectbyvisibletext(WebElement element,String text) {
				Select select = new Select(element);
				select.deselectByVisibleText(text);
			}
			//24.Deselect all
			public void deselectall(WebElement element) {
				Select select = new Select(element);
				select.deselectAll();
			}
			//25.Select is multiple
			public void ismultiple(WebElement element) {
				Select select = new Select(element);
				select.isMultiple();
			}
				//26.get all selected options
				public List<WebElement>options(WebElement element1) {
					Select select1 = new Select(element1);
					List<WebElement> allSelectedOptions = select1.getAllSelectedOptions();
					return allSelectedOptions;
					}
				//27. Locating with text
				public WebElement text(String XPath,String text1, WebElement element11) {
					return driver.findElement(By.xpath(text1));
					}
				//28.get text
				public String gettext(WebElement element,String text) {
					String text2 = element.getText();
					return text2;
			}
				 //29.get Attribute
				public String getAttribute(WebElement element,String value) {
					String attribute = element.getAttribute(value);
					return attribute;
				}
				//30.Robot key press
				public void keypress(String keycode) throws AWTException {
					Robot robot=new Robot();
					robot.keyPress(KeyEvent.VK_DOWN);
					} 
				//31.Robot key Release
				public void keyrelease(String keycode) throws AWTException {
					Robot robot=new Robot();
					robot.keyPress(KeyEvent.VK_DOWN);
						}
			//	32. Actions key Down
				public void actionskeydown(WebElement element) {
					Actions actions = new Actions(driver);
					actions.keyDown(Keys.SHIFT);
				}
				//33.Actions keyUp
				public void actionskeyup(WebElement element) {
					Actions actions = new Actions(driver);
					actions.keyDown(Keys.SHIFT);
			}
				//34.Actions Insert
				public void actionsinsert(WebElement element,String Value) {
					Actions actions = new Actions(driver);
					actions.sendKeys(element,Value);
				}
				//35.Accept alert
				public void acceptalert(WebElement element) {
					Alert alert = driver.switchTo().alert();
					alert.accept();
				}
				//36.Dismiss alert
				public void dismissalert(WebElement element) {
					Alert alert = driver.switchTo().alert();
					alert.dismiss();
				}
				//37.get text in alert
				public void gettext(WebElement element ) {
					Alert alert = driver.switchTo().alert();
					String text = alert.getText();
				}
				//38.frames by index
				public void frameindex(int index,String tagname) {
					driver.switchTo().frame(index);
					WebElement findElement = driver.findElement(By.tagName(tagname));
					}
				//39.Frame by id
				public void frameid(String id) {
					driver.switchTo().frame(id);
				}
				//42.frame by webelement
				public void webelementref(WebElement element,String xpath) {
					WebElement element1 = driver.findElement(By.xpath(xpath));
					driver.switchTo().frame(element1);
				}
				//43.navigate to particular URL
				public void navigateto(String Url) {
					driver.navigate().to(Url);
					}
				//44. Navigate back
				public void navigateback() {
					driver.navigate().back();
				}
				//45.Navigate forward
				public void navigateforward() {
					driver.navigate().forward();
				}
				//46.to  refresh the page
				public void refresh() {
					driver.navigate().refresh();
				}
				
				}
			

