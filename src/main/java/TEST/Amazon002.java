package TEST;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import POM.Amazonhome002;
import POM.Home;
import POM.loginamazon_001;
import Utility.Screensht;

public class Amazon002 extends Testbase2

{	
	
	
	@Test
	public void setup() throws IOException
	{
			
			Amazonhome002  hp = new Amazonhome002(driver);
			hp.search();
			System.out.println("product is search");
			
			
			
			//validation
			System.out.println("Apply validation");
			String exepectedproductcount="Samsung galaxy";
			String actualProduct=hp.toString();
			Assert.assertEquals(actualProduct,exepectedproductcount);

			
	}		
	
	
}
