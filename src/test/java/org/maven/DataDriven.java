package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven extends BaseClassMaven {
	public static void main(String[] args) throws IOException {
		browserConfig();
		openBrowser("https://www.facebook.com/");
		maximize();
		String Username = getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 0);
		WebElement txtUsername = driver.findElement(By.id("email"));
		type(txtUsername, Username);
		WebElement txtPass = driver.findElement(By.id("pass"));
		String password = getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 1);
		type(txtPass, password);
		WebElement btnLogin = driver.findElement(By.name("login"));
		click(btnLogin);
		WebElement errorText = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String text = errorText.getText();
		insertValueInExcel0("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 2, text);
		
		System.out.println("Done....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("Sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		
		WebElement txtusername = driver.findElement(By.id("email"));
		type(txtusername, stringCellValue);
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		WebElement txtPass = driver.findElement(By.id("pass"));
		type(txtPass, stringCellValue2);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*File f=new File("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("Sheet3");
		Row createRow = sheet.createRow(6);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("New row");
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done...");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//File f=new File("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx");
//FileInputStream fis=new FileInputStream(f);
//Workbook w=new XSSFWorkbook(fis);
//Sheet sheet2 = w.getSheet("Sheet1");
//Row createRow = sheet2.createRow(1);
//Cell createCell = createRow.createCell(10);
//createCell.setCellValue("gss");
//FileOutputStream fout=new FileOutputStream(f);
//w.write(fout);
//
//System.out.println("done..");

/*int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
System.out.println("Number of Rows: "+physicalNumberOfRows);

Row row = sheet.getRow(0);
int physicalNumberOfCells = row.getPhysicalNumberOfCells();
System.out.println("Number of Cells: "+physicalNumberOfCells);
*/



















/*for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
	Row row = sheet.getRow(i);
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		int cellType = cell.getCellType();
		if(cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(cell)){
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyyy");
				String format = sim.format(dateCellValue);
				System.out.println(format);
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l=(long) numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
			}
		}*/
	
/*Row row = sheet.getRow(0);
for(int i=0;i<row.getPhysicalNumberOfCells();i++) {
	Cell cell = row.getCell(i);
	System.out.println(cell);*/
}
}
