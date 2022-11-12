package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Home;
import POM.LoginPOMClass;
import POM.loginamazon_001;

public class Amazon_001 extends Testbase2

{	
	@Test
	public void Amazon001()
	
	{
		    
			//validation
			System.out.println("Apply validation");		
			String expectedTitle = "Amazon Sign In";   		
			String actualTitle =driver.getTitle();	
			System.out.println("your title is->"+actualTitle);
			
			Assert.assertEquals(actualTitle,expectedTitle);
			
			//driver.quit();

			
	 }
	
}
