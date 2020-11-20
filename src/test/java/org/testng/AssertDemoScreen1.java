package org.testng;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertDemoScreen1 extends BaseClass {
	
	public AssertDemoScreen1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement btnCreate;

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	

	
}
