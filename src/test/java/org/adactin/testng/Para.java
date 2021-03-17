package org.adactin.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	@Parameters({"eil","pass"})
@Test
public void Para(@Optional("hdfsjdfhsdgf") String email,String pass) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SampleMavenProject\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txtUsername = driver.findElement(By.id("email"));
txtUsername.sendKeys(email);
WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys(pass);
}
}
