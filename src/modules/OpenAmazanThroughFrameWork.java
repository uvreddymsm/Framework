package modules;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import objectRepository.Locators;
import utility.GlobalFunctions;
import utility.ReportManager;

public class OpenAmazanThroughFrameWork extends ReportManager {
	
	
//	@Test
//	public void TC1() throws Exception {
//
//		test=extent.startTest( "This is Amazon Application");
//		driver=GlobalFunctions.launchBrowser(driver);
//		test.log(LogStatus.INFO, "Browser Launched Sucessfully");
//		GlobalFunctions.openUrl(driver, "url");
//		test.log(LogStatus.INFO, "Amazon Application Opend");
//		GlobalFunctions.sendkeys(driver, Locators.amazonSearch, "SearchInAmazon");
//		GlobalFunctions.click(driver, Locators.searchIcon);
//		
//	}
//	
//	@Test
//	public void TC2() throws Exception {
//
//		test=extent.startTest( "This Is Volunteer Sign Up");
//		driver=GlobalFunctions.launchBrowser(driver);
//		test.log(LogStatus.INFO, "Browser Launched Sucessfully");
//		GlobalFunctions.openUrl(driver, "url1");
//		GlobalFunctions.sendkeys(driver, Locators.FirstName, "Firstname");
//		GlobalFunctions.sendkeys(driver, Locators.LastName, "LastName");
//		GlobalFunctions.sendkeys(driver, Locators.PhoneNo, "Phone");
//		GlobalFunctions.sendkeys(driver, Locators.Country, "Country");
//		
//		
//	}

	
	@Test
	public void TC3() throws Exception {

		test=extent.startTest( "This is Amazon Application");
		driver=GlobalFunctions.launchBrowser(driver);
		test.log(LogStatus.INFO, "Browser Launched Sucessfully");
		GlobalFunctions.openUrl(driver, "url");
		GlobalFunctions.selectValueByVisibleText(driver, Locators.dropdown, "Option2");
		test.log(LogStatus.INFO, "Hey Buddy | Option 2 Values Selected");
		
		
	}
	
	@Test
	public void TC4() throws Exception {

		test=extent.startTest( "Just Sowing All The Logs");
		
		test.log(LogStatus.INFO, "Buddy | This Is Info Log");
		test.log(LogStatus.ERROR, "Buddy | This Is Error Log");
		test.log(LogStatus.FATAL, "Buddy | This Is Fatal Log");
		test.log(LogStatus.SKIP, "Buddy | This Is Skip Log");
		test.log(LogStatus.FAIL, "Buddy | This Is Fail Log");
		test.log(LogStatus.WARNING, "Buddy | This Is Warning Log");
		
		
		
	}
	
}
