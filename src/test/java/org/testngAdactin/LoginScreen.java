package org.testngAdactin;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends BaseClass {

	public LoginScreen() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;
	@FindAll({ @FindBy(id = "password"), @FindBy(className = "login_input") })
	private WebElement userPass;
	@FindBys({ @FindBy(id = "login"), @FindBy(xpath = "//input[@name='login']") })
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getUserPass() {
		return userPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
