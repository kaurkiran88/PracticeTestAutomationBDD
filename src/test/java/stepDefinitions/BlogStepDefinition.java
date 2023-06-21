package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BlogStepDefinition extends TestBase{
	
	WebDriver driver;

	@Before("@BlogTest")
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "/Users/kataria99/Desktop/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver(); 
	}
	
	@Given("user is on blog page of Practice Test Automation Website")
	public void user_is_on_blog_page_of_practice_test_automation_website() {
		driver.get(prop.getProperty("homeUrl"));
		driver.findElement(By.xpath("//li[@id='menu-item-19']")).click();
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Blog | Practice Test Automation");
	}
	@Given("user clicks on Unusual Uses for Selenium WebDriver")
	public void user_clicks_on_unusual_uses_for_selenium_web_driver() {
		driver.findElement(By.xpath("//a[contains(text(),'Unusual Uses for Selenium WebDriver')]")).click();
	}
	@Then("user is on Unusual Uses for Selenium WebDriver blog page")
	public void user_is_on_unusual_uses_for_selenium_web_driver_blog_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Unusual Uses for Selenium WebDriver | Practice Test Automation");
	}

	@Given("user clicks on Postman RestAPI Testing")
	public void user_clicks_on_postman_rest_api_testing() {
		driver.findElement(By.xpath("//a[contains(text(),'Postman RestAPI Testing')]")).click();
	}
	@Then("user is on Postman RestAPI Testing blog page")
	public void user_is_on_postman_rest_api_testing_blog_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Postman RestAPI Testing | Practice Test Automation");
	}
	
	@After("@BlogTest")
	public void tearDown() {
		driver.quit();
	}

}
