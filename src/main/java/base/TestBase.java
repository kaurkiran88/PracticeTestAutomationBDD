package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


	public class TestBase {
		//
		
		public static WebDriver driver;
		public static Properties prop;

		public TestBase() {
			try {
				prop = new Properties();
				FileInputStream f = new FileInputStream("/Users/kataria99/Desktop/QA/CucumberWorkspace/PracticeTestAutomationBDD/src/main/java/config/config.properties");
				prop.load(f);
			} catch(FileNotFoundException e){
				e.printStackTrace();
			} catch(IOException e){
				e.printStackTrace();
		}
		
	}
		
		public static void initialization() {
			String browserName = prop.getProperty("browser");
			System.setProperty("webdriver.gecko.driver", "/Users/kataria99/Desktop/QA/SeleniumJars/geckodriver");
			if(browserName.equals("firefox")) {
				driver = new FirefoxDriver(); 
			} else if(browserName.equals("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
			}else {
				driver = new SafariDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
