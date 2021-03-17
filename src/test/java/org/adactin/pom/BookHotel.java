package org.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(id="cc_type")
	private WebElement dDcc_type;
	
	@FindAll({
		@FindBy(id="cc_exp_month"),
		@FindBy(name="cc_exp_month")
	})
	private WebElement dDcc_exp_month;
	
	@FindAll({
		@FindBy(id="cc_exp_year"),
		@FindBy(name="cc_exp_year")
	})
	private WebElement dDcc_exp_year;
	
	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getdDcc_type() {
		return dDcc_type;
	}

	public WebElement getdDcc_exp_month() {
		return dDcc_exp_month;
	}

	public WebElement getdDcc_exp_year() {
		return dDcc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBtnBook_now() {
		return btnBook_now;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id="book_now")
	private WebElement btnBook_now;
	
	@FindBy(id="cancel")
	private WebElement btnCancel;
}
