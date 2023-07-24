package Basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script {
	

	@FindBy(id="email")
	private WebElement un_txt;
	
	@FindBy(id="pass")
	private WebElement pass_txt;
	
	@FindBy(name="login")
	private WebElement login_btn;
	
	
	public Pom_Script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Username(String un)
	{
		un_txt.sendKeys(un);
	}
	

	public void Password(String pwd)
	{
		pass_txt.sendKeys(pwd);
	}


	public void Click_login()
	{
		login_btn.click();
	}


}
