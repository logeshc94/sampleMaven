package org.testngAdactin;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinTestCase extends BaseClass {
	private LocationScreen2 ls2;

	private void createObj() {
		ls2 = new LocationScreen2();
	}

	// browser launch
	@BeforeClass
	private void browserLanuch() {
		browserLanch();
		urlLanch("http://adactinhotelapp.com/");
	}

	// screen 1 login page
	@Parameters({ "username", "password" })
	@Test
	private void screen1(String userValue, String userPass) {
		LoginScreen ls = new LoginScreen();
		txtInPut(ls.getUserName(), userValue);
		txtInPut(ls.getUserPass(), userPass);
		btnClick(ls.getLoginBtn());
	}

	// screen 2 Hotel Location page
	@Parameters({ "hotelLoc" })
	@Test
	private void screen2(String l) {
		createObj();
		secByValue(ls2.getSecLocation(), l);
	}

	@Parameters({ "HotelSun", "selectRoom" })
	@Test(enabled = false)
	private void screen2m2(String hot, String rom) {
		createObj();
		secByValue(ls2.getFindHotel(), hot);
		secByValue(ls2.getRoomType(), rom);
	}

	@Parameters({ "numOfRooms", "perRoom" })
	@Test(enabled = false)
	private void screen2m3(String nos, String s) {
		createObj();
		secByValue(ls2.getnOfRooms(), nos);
		secByValue(ls2.getPerRoom(), s);
	}

	@Test
	private void screen2m4() {
		createObj();
		btnClick(ls2.getBtnSearch());

	}
	
	// screen3 Select hotel page 
	@Test
	private void selectHotel() {
		RadioScreen3 rs = new RadioScreen3();
		btnClick(rs.getRadioClick());
		btnClick(rs.getBtnContinue());
		System.out.println(rs);
//		WebElement ele = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
//		ele.sendKeys("lohg");
	}
	@Test
	private void add() {
		AddressScreen4 ad = new AddressScreen4();
		System.out.println(ad);
		txtInPut(ad.getFirstName(), "log");

	}
}














