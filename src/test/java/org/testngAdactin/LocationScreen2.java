package org.testngAdactin;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationScreen2 extends BaseClass {
	
	public LocationScreen2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement secLocation;
	
	@FindBy(id="hotels")
	private WebElement findHotel;
	
	@FindBy(xpath= "//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement nOfRooms;
	
	@FindBy(id="adult_room")
	private WebElement perRoom;
	
	@FindAll({@FindBy(id="Submit"), @FindBy(name="Submit")})
	private WebElement btnSearch;
	
	public WebElement getSecLocation() {
		return secLocation;
	}

	public WebElement getFindHotel() {
		return findHotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getnOfRooms() {
		return nOfRooms;
	}

	public WebElement getPerRoom() {
		return perRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}


	
	
}
