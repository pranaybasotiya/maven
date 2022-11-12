package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Home;
import POM.LoginPOMClass;

public class verifyaddtocartallproduct extends Tetsbase

{
	
	@Test
	public void Validation()
		{	
				
			Home  hp = new Home(driver);
			hp.AddTocartbutton();
			System.out.println("Bag product is selected");
	

			
			//validation
			System.out.println("Apply validation");
			String expectedvalue="6";
			String ActualTitle=hp.bagproduct();
			
			
			Assert.assertEquals(ActualTitle,expectedvalue);
			
			
			
			
			
			
			
//			if(exepectedproductcount.equals(actualProduct))
//			{
//				System.out.println("Bag product test case is pass");
//			}
//			else
//			{
//				System.out.println("Bag product  test case is fail");
//			}
         }
	
 }

