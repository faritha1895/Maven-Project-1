package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PractiseAdactin extends BaseClassMaven{
public static void main(String[] args) throws IOException {
	browserConfig();
	openBrowser("http://adactinhotelapp.com/");
	maximize();
	WebElement txtUsername = driver.findElement(By.id("username"));
	type(txtUsername,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 0));
	
	WebElement txtPassword = driver.findElement(By.id("password"));
	type(txtPassword,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet2", 1, 1));
	implicitWait(3);
	WebElement btnLogin = driver.findElement(By.id("login"));
	click(btnLogin);
	
	WebElement location1 = driver.findElement(By.id("location"));
	dropDownSelectbyText(location1, "Melbourne");
	
	WebElement hotels = driver.findElement(By.id("hotels"));
	dropDownSelectbyText(hotels, "Hotel Hervey");
	
	WebElement room_nos = driver.findElement(By.id("room_nos"));
	dropDownSelectbyText(room_nos, "3 - Three");
	implicitWait(3);
	WebElement datepick_in = driver.findElement(By.id("datepick_in"));
	type(datepick_in,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 2, 3));

	WebElement datepick_out = driver.findElement(By.id("datepick_out"));
	type(datepick_out,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 2, 4));

	WebElement adult_room = driver.findElement(By.id("adult_room"));
	dropDownSelectbyText(adult_room, "1 - One");
	implicitWait(3);

	WebElement btnSearch = driver.findElement(By.id("Submit"));
	click(btnSearch);
	
	WebElement radiobutton_2 = driver.findElement(By.id("radiobutton_2"));
	click(radiobutton_2);
	
	WebElement btncontinue = driver.findElement(By.id("continue"));
	click(btncontinue);
	
	WebElement first_name = driver.findElement(By.id("first_name"));
	type(first_name,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 0));

	WebElement last_name = driver.findElement(By.id("last_name"));
	type(last_name,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 1));

	WebElement address = driver.findElement(By.id("address"));
	type(address,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 2));

	WebElement cc_num = driver.findElement(By.id("cc_num"));
	type(cc_num,getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 3));
	
	WebElement cc_type = driver.findElement(By.id("cc_type"));
	dropDownSelectbyText(cc_type, "VISA");

	WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
    dropDownSelectbyText(cc_exp_month, "March");
	
	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
	dropDownSelectbyText(cc_exp_year, "2022");
	
	WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
	type(cc_cvv, getValueFromExcel("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet3", 8, 4));
	
	WebElement btnbook_now = driver.findElement(By.id("book_now"));
	click(btnbook_now);

	implicitWait(10);
	
	
	WebElement order_no = driver.findElement(By.id("order_no"));
	String attribute = order_no.getAttribute("value");
	insertValueInExcel1("C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Excel\\Employee Data.xlsx", "Sheet1", 1, 11, attribute);
	System.out.println("done...");
}
}
