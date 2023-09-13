package driverconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
static	WebDriver driver;

	public WebDriver initBrowser (String browsername)
	{
		 driver = new ChromeDriver();
		
		if (browsername.equalsIgnoreCase("Chrome"))
		{
			 driver= new ChromeDriver();
		}
		
		else if (browsername.equals("Firefox")) 
		{
			
			driver= new FirefoxDriver();
		}
		  
		return driver;
	}
	
	//below one is used when need an object to call any where or if we do not need a multiple browser opened situation
	public  static WebDriver getDriver() {
		
		return driver;
	}
	
}
