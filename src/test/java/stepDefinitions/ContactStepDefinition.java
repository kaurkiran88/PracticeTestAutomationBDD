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

public class ContactStepDefinition extends TestBase{
	
	WebDriver driver;
	
	@Before("@ContactTest")
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "/Users/kataria99/Desktop/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver(); 
	}

	@Given("user is on contact page of Practice Test Automation Website")
	public void user_is_on_contact_page_of_practice_test_automation_website() {
		driver.get(prop.getProperty("homeUrl"));
		driver.findElement(By.xpath("//li[@id='menu-item-18']")).click();
		String title = driver.getTitle();
		 Assert.assertEquals(title, "Contact | Practice Test Automation | Selenium WebDriver");
	}
	@Given("user enters first name and last name")
	public void user_enters_first_name_and_last_name() {
	    driver.findElement(By.xpath("//input[@class='wpforms-field-name-first wpforms-field-required']")).sendKeys(prop.getProperty("firstName"));
	    driver.findElement(By.xpath("//input[@class='wpforms-field-name-last wpforms-field-required']")).sendKeys(prop.getProperty("lastName"));

	}
	@Then("user enters invalid e mail and message")
	public void user_enters_invalid_e_mail_and_message() {
	    driver.findElement(By.xpath("//input[@class='wpforms-field-medium wpforms-field-required']")).sendKeys(prop.getProperty("invalidEmail"));
	    driver.findElement(By.xpath("//textarea[@class='wpforms-field-medium wpforms-field-required']")).sendKeys(prop.getProperty("message"));
	}
	@Then("user click on submit")
	public void user_click_on_submit() {
		driver.findElement(By.xpath("//button[@class='wpforms-submit']")).click();
	}
	@Then("user gets error message for invalid e mail")
	public void user_gets_error_message_for_invalid_e_mail() {
	    boolean flag = driver.findElement(By.xpath("//label[@class='wpforms-error']")).isDisplayed();
	    Assert.assertTrue(flag);
	}
	@Given("user enters last name")
	public void user_enters_last_name() {
		  driver.findElement(By.xpath("//input[@class='wpforms-field-name-last wpforms-field-required']")).sendKeys(prop.getProperty("lastName"));
	}
	@Then("user enters valid e mail and message")
	public void user_enters_valid_e_mail_and_message() {
		driver.findElement(By.xpath("//input[@class='wpforms-field-medium wpforms-field-required']")).sendKeys(prop.getProperty("email"));
	    driver.findElement(By.xpath("//textarea[@class='wpforms-field-medium wpforms-field-required']")).sendKeys(prop.getProperty("message"));
	}
	@Then("user gets error message for empty first name")
	public void user_gets_error_message_for_empty_first_name() {
		 boolean flag = driver.findElement(By.xpath("//label[@class='wpforms-error']")).isDisplayed();
		    Assert.assertTrue(flag);
	}
	
	@After("@ContactTest")
	public void tearDown() {
		driver.quit();
	}




}
