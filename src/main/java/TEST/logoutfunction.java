package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Home;
import POM.LoginPOMClass;

public class logoutfunction extends Tetsbase
{
	
	@Test
	public  void logout()
	{
		
			
			
			Home pb =new Home(driver);
			pb.Clickmenubutton();
			System.out.println("Click on menu button");
			pb.Clickonlogout();
			System.out.println("Click onLogout button");
			
			
			
			
			//Validation
			System.out.println("Apply validation");
			String expectedtitle ="Swag Labs";
			String Actualtitle=driver.getTitle();
			Assert.assertEquals(Actualtitle,expectedtitle);
			
			
			

			
	}
}
