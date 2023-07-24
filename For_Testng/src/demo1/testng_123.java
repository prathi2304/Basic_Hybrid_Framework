package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testng_123 {
@Test(dataProvider = "provide")
public void test(String un, String pwd)
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@DataProvider(name="provide")
public Object[][] provi_data()
{
	return new Object[][] {
		{"Hii","123"},
		{"Hello","456"},
		{"Bye","789"}
	};
}
}
