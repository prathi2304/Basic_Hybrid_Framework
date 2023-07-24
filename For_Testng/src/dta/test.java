package dta;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	
	@Test(dataProvider="Facebook")
	public void sample(String un,String pwd) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		driver.close();
		
		
		
	}
	
	@DataProvider(name="Facebook")
	
	public Object[][]enter_input()
	{
		return new Object[][]
				{
			    
			{"abc","123"},
			{"efg","456"},
			
		       };
		
		
	}
		
		
	
	}
	
	
	
	


