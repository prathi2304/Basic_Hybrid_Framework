package Testing_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Sc


{
@FindBy(xpath="//input[@name='email']")
private WebElement user_name;

@FindBy(xpath="//input[@name='pass']")
private WebElement pass_enter;
	
@FindBy(xpath="//button[text()= 'Log in']")
private WebElement login_btn;


public POM_Sc(WebDriver driver) 
{

PageFactory.initElements(driver,this);

}

public void Enter_name(String un)
{

	user_name.sendKeys(un);
}

public void Pass_enter(String pwd)
{

	pass_enter.sendKeys(pwd);
	
}

public void Login_click()
{

	login_btn.click();
}

}
