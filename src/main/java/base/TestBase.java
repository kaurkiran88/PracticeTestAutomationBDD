package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


	public class TestBase {
		
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
	}
