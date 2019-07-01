package stepDefinitions;

import org.openqa.selenium.By;

import common.BasePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePageDef;

public class Def {
	HomePageDef obj = new HomePageDef();
	@Given("^i open Google Chrome browser$")
	public void i_open_Google_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		obj.launchBrowser();
	}

	@When("^I open FaceBook homepage$")
	public void i_open_FaceBook_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		obj.openChrome();
	}
	@Then("^Enter the (.*) and (.*)$")
	public void enter_the_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		BasePage.driver.findElement(By.id("email")).sendKeys(arg1);
		BasePage.driver.findElement(By.id("pass")).sendKeys(arg2);
		BasePage.driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
		Thread.sleep(10000);
	}

	/*
	 * @Then("^Enter the name([^\"]*) and ([^\"]*)$") public void
	 * enter_the_name_and(String arg1, String arg2) throws Throwable {
	 * 
	 * // Write code here that turns the phrase above into concrete actions // throw
	 * new PendingException(); }
	 */

	@Then("^quit$")
	public void quit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    BasePage.driver.close();
	}

}
