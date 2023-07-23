package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import pages.SlotBookPage;


public class TC_SlotBookPageTest extends BaseClass {

	SoftAssert softAssert = new SoftAssert();

	@Test()
	public void Homepage() throws InterruptedException{
		
		driver.get("https://blazedemo.com/index.php");
		SlotBookPage bp = new SlotBookPage(driver);
		
		bp.clickDepartureCity();
		bp.clickDestinationCity();
		bp.clickFindFlights();
		bp.chooseflight();
		bp.Entername();
		bp.EnterAddress();
		bp.EnterCity();
		bp.EnterState();
		bp.EnterZip();
		bp.EnterCardType();
		bp.EnterCardNumber();
		bp.EnterCardMonth();
		bp.EnterCardYear();
		bp.EnterCardName();
		bp.FinalSumbit();
//		softAssert.assertEquals(driver.getTitle(), "BlazeDemo");
//		softAssert.assertAll();
		
	}
}
