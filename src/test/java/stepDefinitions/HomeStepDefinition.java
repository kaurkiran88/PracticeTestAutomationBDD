package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeStepDefinition extends TestBase{

	@Before("@HomeTest")
	public void setUp() {
		TestBase.initialization();
	}

	@Given("user is on home page of Practice Test Automation Website")
	public void user_is_on_home_page_of_practice_test_automation_website() {
		driver.get(prop.getProperty("homeUrl"));
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Practice Test Automation | Learn Selenium WebDriver");
	
	}
	@Given("user clicks on Practice Link")
	public void user_clicks_on_practice_link() {
	    driver.findElement(By.xpath("//li[@id='menu-item-20']")).click();
	}
	
	@Then("user is on Practice page")
	public void user_is_on_practice_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Practice | Practice Test Automation");
	}

	@Given("user clicks on Blog Link")
	public void user_clicks_on_blog_link() {
		driver.findElement(By.xpath("//li[@id='menu-item-19']")).click();
	}
	
	@Then("user is on Blog page")
	public void user_is_on_blog_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Blog | Practice Test Automation");
	 }
	
	 @Given("user clicks on Contact Link")
	 public void user_clicks_on_contact_link() {
		 driver.findElement(By.xpath("//li[@id='menu-item-18']")).click();
	 }
	 
	 @Then("user is on Contact page")
	 public void user_is_on_contact_page() {
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Contact | Practice Test Automation | Selenium WebDriver");
		
	 }
	 
	 @After("@HomeTest")
		public void tearDown() {
			driver.quit();
		}




}
