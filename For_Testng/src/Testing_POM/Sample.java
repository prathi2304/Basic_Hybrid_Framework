package Testing_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public static void samp() throws InterruptedException 
	
	{
			
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				Thread.sleep(2000);
		
				
		
		
	}

                                                                                                            
}
