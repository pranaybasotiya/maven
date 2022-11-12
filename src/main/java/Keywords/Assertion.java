package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion 
{
	
	@Test
	public void testA()
	{
		String expectedvalue="Swaglab";
		
		String ActualTitle="Swaglab";
		Assert.assertEquals(ActualTitle,expectedvalue);
		
		
		String expectedurl="www.saucedemo.com";
		
		String Actualurl="www.saucedemo.com";
		Assert.assertEquals(Actualurl,expectedurl);
		
	}
	
	@Test
	public void testB()
	{
		System.out.println("hi");
	}
}
