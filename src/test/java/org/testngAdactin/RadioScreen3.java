package org.testngAdactin;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RadioScreen3 extends BaseClass {
	
	public RadioScreen3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id = "radiobutton_1"), @FindBy(xpath="//input[@name='radiobutton_1']")})
	private WebElement radioClick;
	
	@FindAll({@FindBy(name="continue"), @FindBy(id="continue")})
	private WebElement btnContinue;

	
	public WebElement getRadioClick() {
		return radioClick;
	}


	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	
}
