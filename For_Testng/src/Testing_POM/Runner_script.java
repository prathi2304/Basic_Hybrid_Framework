package Testing_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_script {
	
	
@Test
public void Fb() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
POM_Sc p= new POM_Sc(driver);
p.Enter_name("Qspider");
Thread.sleep(1000);
p.Pass_enter("Rajajinagar");
Thread.sleep(1000);
p.Login_click();
	
	
	
}

}
