package org.adactin.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	static WebDriver driver;
	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	public static void openBrowser(String url) {
		driver.get(url);
	}
	
public static void maximize() {
	driver.manage().window().maximize();
}

public static void getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
}

public static void getCurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
}

public static String type(WebElement element,String values) {
	element.sendKeys(values);
	return values;
}  

public static void click(WebElement element) {
	element.click();
}
public static void Login(WebElement UserNameElement,WebElement PassElement,WebElement btnLogin, String value1,String value2) {
	UserNameElement.sendKeys(value1);
	PassElement.sendKeys(value2);
	btnLogin.click();
}
public static void getTextfromWebpage(WebElement element) {
	String text = element.getText();
	System.out.println(text);
}

public static void getValuefromWebpage(WebElement element) {
	String text = element.getAttribute("value");
	System.out.println(text);
}

public static void mouseOver(WebElement element) {
	Actions acc=new Actions(driver);
	acc.moveToElement(element).perform();
}

public static void dragAndDrop(WebElement source,WebElement target) {
	Actions acc=new Actions(driver);
	acc.dragAndDrop(source, target);
}

public static void contextClick(WebElement element) {
	Actions acc=new Actions(driver);
	acc.contextClick(element).perform();
}

public static void doubleClick(WebElement element) {
	Actions acc=new Actions(driver);
	acc.doubleClick(element).perform();
	}

public static void typeUsingActionClass(String values) {
	Actions acc=new Actions(driver);
	acc.sendKeys(values);
}

public static void clickUsingActionClass(WebElement element) {
	Actions acc=new Actions(driver);
    acc.click(element).perform();
	}

public static void clickAndHoldActions(WebElement element) {
	Actions acc=new Actions(driver);
    acc.clickAndHold(element).perform();
	}

public static void releaseActions(WebElement element) {
	Actions acc=new Actions(driver);
    acc.release(element);
	}

public static void framesId(int values) {
	driver.switchTo().frame(values);
}

public static void framesName(String values) {
	driver.switchTo().frame(values);
}

public static void framesWebelement(WebElement element) {
driver.switchTo().frame(element);
}

public static void switchToParentFrame() {
	driver.switchTo().parentFrame();
}

public static void switchOutOfFrame() {
	driver.switchTo().defaultContent();
}

public static void screenShot(String location) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(location);
	FileUtils.copyFile(source, dest);
}

public static void javaScriptScrollDown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}

public static void javaScriptScrollup(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);
}

public static void javaScripTypeValue(String values) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value',values)");
}

public static void javaScripGetValue(String values) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].getAttribute('value')");
}

public static void javaScripClick(String values) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()");
}

public static void windowHandlingToOneChild() {
	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for(String s:windowHandles) {
		if(!windowHandle.equals(windowHandles)){
			driver.switchTo().window(s);
		}
	}
}

public static void windowHandlingMorethanOne(int c) {
	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	int count=0;
	for(String s:windowHandles) {
		if(count==c){
			driver.switchTo().window(s);
		}
	}
}

public static void alertAccept() {
	Alert a=driver.switchTo().alert();
	a.accept();
}

public static void alertAcceptWithText(String values) {
	Alert a=driver.switchTo().alert();
	a.sendKeys(values);
	a.accept();
}

public static void alertDismiss() {
	Alert a=driver.switchTo().alert();
	a.dismiss();
}

public static void alertDismissWithText(String values) {
	Alert a=driver.switchTo().alert();
	a.sendKeys(values);
	a.dismiss();
}

public static void alertGetText(String values) {
	Alert a=driver.switchTo().alert();
	a.sendKeys(values);
	String text = a.getText();
	System.out.println(text);
}

public static String dropDownSelectbyText(WebElement element,String values) {
	Select s=new Select(element);
s.selectByVisibleText(values);
return values;
}

public static void dropDownDeselectbyText(WebElement element,String values) {
	Select s=new Select(element);
 s.deselectByVisibleText(values);
}

public static void dropDownSelectbyIndex(WebElement element,int values) {
	Select s=new Select(element);
	s.selectByIndex(values);
}

public static void dropDownDeselectbyIndex(WebElement element,int values) {
	Select s=new Select(element);
 s.deselectByIndex(values);
}

public static void dropDownSelectbyValue(WebElement element,String values) {
	Select s=new Select(element);
	s.selectByValue(values);
}

public static void dropDownDeselectbyValue(WebElement element,String values) {
	Select s=new Select(element);
 s.deselectByValue(values);
}

public static void dropDownDeselectAll(WebElement element) {
	Select s=new Select(element);
    s.deselectAll();
}
public static void dDgetFirstSelected(WebElement element) {
	Select s=new Select(element);
    WebElement firstSelectedOption = s.getFirstSelectedOption();
    String text = firstSelectedOption.getText();
    System.out.println(text);
}
public static void dDgetAllSelected(WebElement element,int values) {
	Select s=new Select(element);
    List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    WebElement webElement = allSelectedOptions.get(values);
    String text = webElement.getText();
    System.out.println(text);
}

public static void staticWait(int values) throws InterruptedException {
	Thread.sleep(values);
}

public static void implicitWait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}

/*public static void webdriverWait(int value,s) {
	WebDriverWait w=new WebDriverWait(driver,value);
	w.until(ExpectedConditions.)
}*/

/*public static void fluentWait() {

}*/
public static void insertValueInExcel1(String url,String sheet,int row,int cell,String values) throws IOException {
	File f=new File(url);
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
    Sheet sheet2 = w.getSheet(sheet);
    Row createRow = sheet2.getRow(row);
    Cell createCell = createRow.createCell(cell);
    createCell.setCellValue(values);
    FileOutputStream fout=new FileOutputStream(f);
    w.write(fout);   
}
public static void insertValueInExcel0(String url,String sheet,int row,int cell,int values) throws IOException {
	File f=new File(url);
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
    Sheet sheet2 = w.getSheet(sheet);
    Row createRow = sheet2.getRow(row);
    Cell createCell = createRow.createCell(cell);
    createCell.setCellValue(values);
    FileOutputStream fout=new FileOutputStream(f);
    w.write(fout);   
}

public static String getValueFromExcel(String loction,String sheet,int row,int cell) throws IOException {
	File f=new File(loction);
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
    Sheet sheet2 = w.getSheet(sheet);
    Row row2 = sheet2.getRow(row);
    Cell cell2 = row2.getCell(cell);
    int cellType = cell2.getCellType();
    String value=null;
    if(cellType==1) {
    	value = cell2.getStringCellValue();
    }else if(cellType==0) {
    	if(DateUtil.isCellDateFormatted(cell2)) {
    		Date dateCellValue = cell2.getDateCellValue();
    		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
    		value = s.format(dateCellValue);
    	}else {
    		double numericCellValue = cell2.getNumericCellValue();
    		long l=(long) numericCellValue;
    		value = String.valueOf(l);
    	}
    }
    
	return value; 
}

/*public static void cellToString(String loction,String sheet, int row, int cell) throws IOException {
	Cell valueFromExcel = getValueFromExcel(loction, sheet, row, cell);
	 String stringCellValue = valueFromExcel.getStringCellValue();
}*/

public static String map(String value) {
	Map<Integer,String> m=new LinkedHashMap<Integer, String>();
	m.put(10, value);
	Collection<String> values = m.values();
	return value;
	
}
public static void close() {
	driver.close();
}

public static void quit() {
	driver.quit();
}

}
