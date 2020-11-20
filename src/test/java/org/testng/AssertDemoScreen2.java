package org.testng;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertDemoScreen2 extends BaseClass {
	public AssertDemoScreen2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement fName;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement number;

	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement pass;

	@FindBy(id="day")
	private WebElement date;

	@FindBy(id="month")
	private WebElement month;

	@FindBy(id="year")
	private WebElement year;

	@FindBy(id="u_1_3")
	private WebElement gender;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}
	
	
}
