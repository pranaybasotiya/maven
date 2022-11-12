package Maven_testng.Maven_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.loginamazon_001;

public class TestNg2 

{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver_win32\\chromedriver.exe");


				driver=new ChromeDriver();
				System.out.println("Browser is opened");
				
				driver.manage().window().maximize();
				System.out.println("Browser is maximized");
				
				driver.get("  https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				System.out.println("Open url");
				
				
				//constructor
				loginamazon_001 lp = new loginamazon_001(driver);
				lp.sendUsername();//call from public
				System.out.println("Username is entered");
				
				lp.sendbtn();//call from public
				System.out.println("Clicked on login Button");
				
				lp.password();//call from public
				System.out.println("Password is entered");
				
				lp.SignIn();//call from public
				System.out.println("Sign in successfully");
				
				
				System.out.println("Went on HomePage");
				
				//UtilityClass.getScreenshot(driver, "loginPage-22Oct");
	}
	
	@Test
	public void verifylogin()
	{
		//validation
		System.out.println("Apply validation");		
		String expectedTitle = "Amazon Sign In";   		
		String actaulTitle =driver.getTitle();	
		System.out.println("your title is->"+actaulTitle);
		
		if(expectedTitle.equals(actaulTitle))
		{
			System.out.println("Login Test is passed");
		}
		else
		{
			System.out.println("Login Test is failed");
		}
	}
	
	@BeforeMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser is closed");
	}
}
