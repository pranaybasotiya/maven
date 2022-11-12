package TEST;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Home;

public class verify_dropdown extends Tetsbase

{
	@Test
	public void filterdropdown()
		{	
				
			Home  pr = new Home(driver);
			pr.clickOnFilterDropDown();//call from public
			System.out.println("product is sorted");
	

			
			//validation
			System.out.println("Apply validation");
			String expectedvalue="NAME (Z TO A)";
			String ActualTitle=pr.getTextOfFilter();//call from public
			Assert.assertEquals(ActualTitle,expectedvalue);
			
		}
	
}
