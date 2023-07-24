package Basic_hybrid_framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Runnerclass extends BaseClass{
	
	@Test(dataProvider = "fb")
	public void Runn(String un, String pwd) throws InterruptedException
	{
		Pom_Script p =new Pom_Script(driver);
				p.Username(un);
		Thread.sleep(500);
		
			p.Username(pwd);
       Thread.sleep(500);


	}
	@DataProvider(name="fb")
	public Object[][]provide()
			
	{
		return new Object[][]
	  {
		{"Qspider","123"},
		{"jspider","245"}
		
	
	};
	
	}
}
