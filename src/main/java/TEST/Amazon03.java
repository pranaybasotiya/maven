package TEST;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Amazon003;
import POM.Amazonhome002;
import POM.loginamazon_001;

public class Amazon03 extends Testbase2

{	
	
	public void Amazon03()
	{
		
			//Homepage
			Amazonhome002 hp = new Amazonhome002(driver);
			hp.navbar();
			System.out.println("Click on babycare");
			
			hp.pants();
			System.out.println("click on diaper pants");
			
			hp.amazon1();
			System.out.println("Click on amazon logo");
			
			System.out.println("Went to the homepage");
			
			
			hp.search();
			System.out.println("Searching mobile");
			
			hp.btn();
			System.out.println("Click on search button");
			
			hp.mobnme();
			System.out.println("Click on mobile link");
			
			
			//Addtocart
			List<String> allpagead=new ArrayList<String>(driver.getWindowHandles());
			
			String webtitle1=driver.getTitle();
			System.out.println("Your title is->"+webtitle1);
			
      		driver.switchTo().window(allpagead.get(1));
      		
			Amazon003 pb=new Amazon003(driver);
			pb.addbtn();
			System.out.println("Your product is add to cart");
			
			
			
		
	}
}
