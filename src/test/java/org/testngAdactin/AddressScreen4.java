package org.testngAdactin;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressScreen4 extends BaseClass {
	public AddressScreen4() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"first_name\"]")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	
}
