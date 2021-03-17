package org.adactin.junit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {
	static WebDriver driver;
@BeforeClass
public static void browserConfig() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
}
@AfterClass 
public static void close() {
	driver.close();
}
@Before
public void startOfTc1() {
	Date d=new Date();
	System.out.println(d);

}
@After
public void endOfTc1() {
	Date d=new Date();
	System.out.println(d);
}



@Test
public void Tc1_login(){
 	driver.get("http://adactinhotelapp.com/");
	
	driver.manage().window().maximize();
	
	WebElement txtUsername = driver.findElement(By.id("username"));
	txtUsername.sendKeys("faritha181995");
	
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys("suhailbaby@2709");
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();
}

@Test
public void Tc2_searchHotel(){
	Tc1_login();
	driver.manage().window().maximize(); 
	WebElement location1 = driver.findElement(By.id("location"));
	Select s=new Select(location1);
    s.selectByIndex(3);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	WebElement room_nos = driver.findElement(By.id("room_nos"));
	Select s2=new Select(room_nos);
    s2.selectByIndex(4);
   
	WebElement datepick_in = driver.findElement(By.id("datepick_in"));
	datepick_in.sendKeys("08/03/2021");

	WebElement datepick_out = driver.findElement(By.id("datepick_out"));
	datepick_out.sendKeys("09/03/2021");
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
	WebElement adult_room = driver.findElement(By.id("adult_room"));
	Select s3=new Select(adult_room);
    s3.selectByVisibleText("3 - Three");
	
	WebElement btnSearch = driver.findElement(By.id("Submit"));
	btnSearch.click();
}
@Test
public void Tc3_selectHotel(){
	Tc1_login();
	Tc2_searchHotel();
	WebElement radiobutton_2 = driver.findElement(By.id("radiobutton_2"));
	radiobutton_2.click();
	
	WebElement btncontinue = driver.findElement(By.id("continue"));
	btncontinue.click();
	
}
@Ignore
@Test
public void Tc4_bookHotel() {
Tc1_login();
Tc2_searchHotel();
Tc3_selectHotel();
	WebElement first_name = driver.findElement(By.id("first_name"));
	first_name.sendKeys("Faritha");

	WebElement last_name = driver.findElement(By.id("last_name"));
	last_name.sendKeys("suhail");
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("xxxxxxx");

	WebElement cc_num = driver.findElement(By.id("cc_num"));
	cc_num.sendKeys("9876543212345678");
	
	WebElement cc_type = driver.findElement(By.id("cc_type"));
	Select s=new Select(cc_type);
	s.selectByVisibleText("VISA");

	WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
	Select s1=new Select(cc_exp_month);
	s1.selectByVisibleText("March");
	
	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
	Select s2=new Select(cc_exp_year);
	s2.selectByVisibleText("2022");
	
	WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
	cc_cvv.sendKeys("123");
	
	WebElement btnbook_now = driver.findElement(By.id("book_now"));
	btnbook_now.click();
}


}

