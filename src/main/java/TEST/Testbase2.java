package TEST;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import POM.LoginPOMClass;
import POM.loginamazon_001;

public class Testbase2 

{
	
		    WebDriver driver;
			Logger log=Logger.getLogger("Amazon");
			
			@BeforeMethod
			public void login2()
			
	{
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pranay basotiya\\eclipse-workspace\\Maven_testng\\Driverfiles\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			PropertyConfigurator.configure("log4j.properties");
			log.info("Browser is opened");
			
			driver.manage().window().maximize();
			log.info("Browser is maximized");
			
			
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			log.info("Open url");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			loginamazon_001   dp = new loginamazon_001 (driver);
			dp.sendUsername();//call from public
			log.info("Username is entered");
			
			dp.password();//call from public
			log.info("Password is entered");
			
			dp.sendbtn();//call from public
			log.info("Clicked on login Button");
			
			
			log.info("Went on HomePage");
			
			
			
    }
			
			
			@AfterMethod
			public void Teardown()
			{
					 driver.close();
					 log.info("Browser is closed");
					
			}

}
