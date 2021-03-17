 package org.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdactin extends BaseClass {
	
	public LoginAdactin() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")
private WebElement txtEmail;

@FindBy(id="password")
private WebElement txtPassword;

@FindBy(linkText="Forgot Password?")
private WebElement forgetPasswrd;

@FindBy(id="login")
private WebElement btnLogin;

@FindBy(linkText="New User Register Here")
private WebElement newRegister;

@FindBy(xpath="//img[@alt='AdactIn Group']")
private WebElement logo;

@FindBy(xpath="//img[@alt='Adactin Group: Hotel Reservation System']")
private WebElement hotelImg;

@FindBy(xpath="//p[text()='Adactin Launches The Adactin Hotel App! ']")
private WebElement hotelAppText;

@FindBy(xpath="//img[@alt='Hotel Image 3']")
private WebElement hotelAppimg;

@FindBy(xpath="//td[contains(text(),'The best Free learning platform for Software Testing')]")
private WebElement downloadText;

@FindBy(xpath="//img[@src='img/ios-button.png']")
private WebElement forIos;

@FindBy(xpath="//img[@src='img/google-play.png']")
private WebElement forGpay;

@FindBy(xpath="//td[text()='Important Note:']")
private WebElement importantNoteText;

@FindBy(xpath="//td[contains(text(),'l Application has 2 build')] ")
private WebElement buildText;

@FindBy(xpath="//strong[text()='Go to Build 2 ']")
private WebElement build2Link;

@FindBy(xpath="//td[text()='For any queries/issues please email: ']")
private WebElement queriesText;

@FindBy(linkText="info@adactin.com")
private WebElement emailLink;

public WebElement getTxtEmail() {
	return txtEmail;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getForgetPasswrd() {
	return forgetPasswrd;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

public WebElement getNewRegister() {
	return newRegister;
}

public WebElement getLogo() {
	return logo;
}

public WebElement getHotelImg() {
	return hotelImg;
}

public WebElement getHotelAppText() {
	return hotelAppText;
}

public WebElement getHotelAppimg() {
	return hotelAppimg;
}

public WebElement getDownloadText() {
	return downloadText;
}

public WebElement getForIos() {
	return forIos;
}

public WebElement getForGpay() {
	return forGpay;
}

public WebElement getImportantNoteText() {
	return importantNoteText;
}

public WebElement getBuildText() {
	return buildText;
}

public WebElement getBuild2Link() {
	return build2Link;
}

public WebElement getQueriesText() {
	return queriesText;
}

public WebElement getEmailLink() {
	return emailLink;
}



}
