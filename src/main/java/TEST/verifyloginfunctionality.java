package TEST;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.LoginPOMClass;
import Utility.Screensht;

public class verifyloginfunctionality extends Tetsbase 
{
			
	@Test
	public void login() throws IOException
	
	{
		
		Screensht.getscreenshot(driver,"homepage");
			
			   
		//validation
		System.out.println("Apply validation");		
		String expectedvalue = "Swag Labs";   //BA/dev		
		String ActualTitle =driver.getTitle();	
		System.out.println("your title is->"+ActualTitle);
		
		Assert.assertEquals(ActualTitle,expectedvalue);
		
		
		
		
		
		
//		if(expectedvalue.equals(ActualTitle))
//		{
//			System.out.println("Login Test is passed");
//		}
//		else
//		{
//			System.out.println("Login Test is failed");
//		}
		
}
		
	
} 
		




