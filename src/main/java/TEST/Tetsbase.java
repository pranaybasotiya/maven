package TEST;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POM.LoginPOMClass;
import Utility.Screensht;

public class Tetsbase 
{
		WebDriver driver;
		Logger log=Logger.getLogger("Maven_testng");
		
		@Parameters("browserName")
		@BeforeMethod
        public void login1(String browserName )
     {
		
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\pranay basotiya\\eclipse-workspace\\Maven_testng\\Driverfiles\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
	 	
		else
		
		{	
		System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\pranay basotiya\\eclipse-workspace\\Maven_testng\\Driverfiles\\geckodriver.exe");
		 driver=new FirefoxDriver();		
		}		
		
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is opened");
		
		
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("Open url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		//constructor
		LoginPOMClass lp = new LoginPOMClass(driver);
		lp.sendUsername();//call from public
		log.info("Username is entered");
		
		lp.sendpassword();//call from public
		log.info("Password is entered");
		
		lp.sendbtn();//call from public
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
