package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverconfig.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	WebDriver driver;
	DriverFactory df ;
	
	@Before
	public void launch_Browser() throws IOException
	{
		Properties prop =new Properties();
		
		 String path=System.getProperty("user.dir")+"src\\test\\resources\\config.properties";
		 
		 FileInputStream fis = new FileInputStream(path);
		 
		 prop.load(fis);
		 
		String browser_Name=prop.getProperty("browser");
		
		 df = new DriverFactory();
		df.initBrowser(browser_Name);
		
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tear_Down() {
		
		driver.close();
	}
	
	
}
