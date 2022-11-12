package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertion 

{
	
	SoftAssert soft=new SoftAssert();
	@Test
	public void testA()
	{
		String expectedvalue="Swaglab";
		
	 	String ActualTitle="Swagla";
		soft.assertEquals(ActualTitle,expectedvalue);
		
		
		String expectedurl="www.saucedemo.com";
		
		String Actualurl="www.saucedemo.com";
		soft.assertEquals(Actualurl,expectedurl);
		
		soft.assertAll();
		
	}
	
	@Test
	public void testB()
	{
		System.out.println("hi");
	}
}
