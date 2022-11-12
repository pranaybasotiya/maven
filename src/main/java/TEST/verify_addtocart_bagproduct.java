package TEST;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Home;
import POM.LoginPOMClass;
import Utility.Screensht;

public class verify_addtocart_bagproduct extends Tetsbase 

{
	@Test
	public void setup() throws IOException
	{
			
			Home  hp = new Home(driver);
			hp.addtocart();
			System.out.println("Bag product is selected");
			
			Screensht.getscreenshot(driver,"addtocart");
			
			//validation
			System.out.println("Apply validation");
			String exepectedproductcount="1";
			String actualProduct=hp.bagproduct();
			Assert.assertEquals(actualProduct,exepectedproductcount);

			
			
			
			
			

			
	}		
	
			
}
	


