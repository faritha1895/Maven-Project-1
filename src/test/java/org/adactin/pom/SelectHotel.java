package org.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
PageFactory.initElements(driver, this);
}
	@FindBys({
		@FindBy(id="radiobutton_1"),
		@FindBy(name="radiobutton_1")
	})
	private WebElement radioButton1;
	
	
	@FindBy(name="radiobutton_2")
	private WebElement radioButton2;
	
	@FindBys({
		@FindBy(id="radiobutton_3"),
	})
	
	private WebElement radioButton3;
	@FindBys({
		@FindBy(id="radiobutton_4"),
	
	})
	private WebElement radioButton4;
	
	@FindAll({
		@FindBy(id="continue"),
		@FindBy(name="continue"),
		@FindBy(xpath="//input[@type='submit']")
	})
	private WebElement btnContinue;
	
	@FindAll({
		@FindBy(id="cancel"),
		@FindBy(name="cancel"),
	})
	
	private WebElement btnCancel;

	public WebElement getRadioButton1() {
		return radioButton1;
	}

	public WebElement getRadioButton2() {
		return radioButton2;
	}

	public WebElement getRadioButton3() {
		return radioButton3;
	}

	public WebElement getRadioButton4() {
		return radioButton4;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
}
