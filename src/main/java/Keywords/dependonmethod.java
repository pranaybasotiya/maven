package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependonmethod 

{
	@Test
	public void Login()
	{
		System.out.println("Login test");
		Assert.assertTrue(false);
	}
	
	
	
	@Test(dependsOnMethods= {"Login"})
	public void Addtocart()
	{
		System.out.println("Add to cart");
	}
	
}
