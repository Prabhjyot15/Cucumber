package testrunners;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BasePage;
import cucumber.api.Scenario;

public class ScreenShot {
	
	@After
	public void tearDown(Scenario scenario) {
	    
	      // Take a screenshot...
	      final byte[] screenshot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
	      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
	 
	}

}
