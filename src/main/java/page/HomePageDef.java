package page;

import org.openqa.selenium.chrome.ChromeDriver;

import common.BasePage;

public class HomePageDef extends BasePage{
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","F:\\Downloads\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
}

public void openChrome() {
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
}

}
