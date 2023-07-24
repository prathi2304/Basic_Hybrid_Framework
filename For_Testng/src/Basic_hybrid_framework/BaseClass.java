package Basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Framework {
	
	public WebDriver driver;
	@BeforeMethod
	
	public void Open_App()
	{
	
		
		System.setProperty(gecko_key,gecko_value);
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Base_url);
		
	}
	
	@AfterMethod
	public void Close_App()
	{
		driver.close();
	}

}
