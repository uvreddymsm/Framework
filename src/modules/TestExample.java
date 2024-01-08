package src.modules;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.applaudGS.automation.objectrepository1.Locators;
//import com.applaudGS.automation.utility1.GlobalFunctions;
//import com.applaudGS.automation.utility1.ReportManager;
import com.relevantcodes.extentreports.LogStatus;

import objectRepository.Locators;
import utility.GlobalFunctions;
import utility.ReportManager;

import static src.utility.GlobalObjects.driver;

public class TestExample extends ReportManager{
	

	
	@Test
	public void TC1() throws Exception {
		
		
		test=extent.startTest( "Sample Program Through Framework");
	driver=	GlobalFunctions.launchBrowser(driver);
		GlobalFunctions.openUrl(driver,"url");
		test.log(LogStatus.INFO, "Browser Launched Sucessfully");
		GlobalFunctions.sendkeys(driver, Locators.FirstName, "Firstname");
		

		
	
	}

	

}
