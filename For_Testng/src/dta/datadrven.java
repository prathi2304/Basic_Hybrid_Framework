package dta;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrven {
	@Test(dataProvider = "Facebook")
	public void Test(String un,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("htttps://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500); 
		driver.close();
		
		
		
	}
	
@DataProvider(name="facebook")
	
public Object[][] enter_data() {
	return new Object[][]{
	{"hi", "123"},
	{"bye","2345"},
	{"hello","345"},
};
	
}
	
}
