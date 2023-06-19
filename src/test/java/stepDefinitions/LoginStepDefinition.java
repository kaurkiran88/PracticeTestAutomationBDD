package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinition extends TestBase{
	
	@Before("@LoginTest")
	public void setUp() {
		TestBase.initialization();
	}
	
	
	@Given("user is on test login page of Practice Test Automation Website")
	public void user_is_on_test_login_page_of_Practice_Test_aAutomation_Website()  {
		
		driver.get(prop.getProperty("loginUrl"));
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Test Login | Practice Test Automation");
	}
	
	@Given("user enters correct username and password")
	public void user_enters_correct_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys(prop.getProperty("correctUsername"));
	    driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	}
	
	@Given("user enters incorrect username and password")
	public void user_enters_incorrect_username_and_password() {
		 driver.findElement(By.id("username")).sendKeys(prop.getProperty("incorrectUsername"));
	     driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	}
	
	@Then("user clicks on submit")
	public void user_clicks_on_submit() {
		driver.findElement(By.id("submit")).click();
	
	}
	
	@Then("user is on logged in")
	public void user_is_on_logged_in() {
	    String title = driver.getTitle();
	    Assert.assertEquals(title, "Logged In Successfully | Practice Test Automation");
	}


	@Then("user gets error message for incorrect username")
	public void user_gets_error_message_for_incorrect_username() {
	    boolean flag = driver.findElement(By.id("error")).isDisplayed();
	    Assert.assertTrue(flag);
	  }
	
	@After("@LoginTest")
	public void tearDown() {
		driver.quit();
	}

	
}
