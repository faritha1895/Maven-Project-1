package org.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
public SearchHotel() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;

@FindBy(id="room_nos")
private WebElement room_nos;

@FindBy(id="datepick_in")
private WebElement datepick_in;

@FindBy(id="datepick_out")
private WebElement datepick_out;

@FindBy(id="adult_room")
private WebElement adult_room;

@FindBy(id="Submit")
private WebElement Submit;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getDatepick_in() {
	return datepick_in;
}

public WebElement getDatepick_out() {
	return datepick_out;
}

public WebElement getAdult_room() {
	return adult_room;
}

public WebElement getSubmit() {
	return Submit;
}
}
