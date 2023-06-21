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

public class PracticeStepDefinition extends TestBase{
	
	WebDriver driver;
	
	@Before("@PracticeTest")
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "/Users/kataria99/Desktop/QA/SeleniumJars/geckodriver");
		driver = new FirefoxDriver(); 
	}

	@Given("user is on practice page of Practice Test Automation Website")
	public void user_is_on_practice_page_of_practice_test_automation_website() {
		driver.get(prop.getProperty("homeUrl"));
		driver.findElement(By.xpath("//li[@id='menu-item-20']")).click();
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Practice | Practice Test Automation");
	}
	@Given("user clicks on Test Login Page Link")
	public void user_clicks_on_test_login_page_link() {
	    driver.findElement(By.xpath("//a[contains(text(),'Test Login Page')]")).click();
	}
	@Then("user is on Test Login Page page")
	public void user_is_on_test_login_page_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Test Login | Practice Test Automation");
	}
	@Given("user clicks on Test Exceptions Link")
	public void user_clicks_on_test_exceptions_link() {
	    driver.findElement(By.xpath("//a[contains(text(),'Test Exceptions')]")).click();
	}
	@Then("user is on Test Exceptions page")
	public void user_is_on_test_exceptions_page() {
		String title = driver.getTitle();
	    Assert.assertEquals(title, "Test Exceptions | Practice Test Automation");
	}
	
	@After("@PracticeTest")
	public void tearDown() {
		driver.quit();
	}

}