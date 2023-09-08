package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

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
		
		 String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		 
		 FileInputStream fis = new FileInputStream(path);
		 
		 prop.load(fis);
		 
		String browser_Name=prop.getProperty("browser");
		
		df = new DriverFactory();
		
		driver=df.initBrowser(browser_Name);
		
		driver.manage().window().maximize();
		
	}
	
	@After(order=1)
	public void quitBrowser() {
		
		driver.quit();
	}
	
	@After(order=2)
	public void tear_Down (io.cucumber.java.Scenario scenario) {				// here taking screenshot so calling Scenario class from cucumber
		
	boolean is_Failed = scenario.isFailed();
	
	if (is_Failed) 
	{
		
		 String scenario_Name = scenario.getName();
		 String name=scenario_Name.replaceAll(" ", "_");
		  
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(source, "image/png", name);
		
	}
		
	}
	
	
	
}
