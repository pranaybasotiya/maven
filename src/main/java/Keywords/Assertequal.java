package Keywords;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertequal 

{
	@Test
	public void equal()
	{
		String exp ="pranay";
		String act="pranay";
		
		Assert.assertEquals(act,exp,"Testcase fail");
		
		
		
		
//		int exp1 =10;
//		int act1= 10;
//		
//		Assert.assertEquals(act1,exp1);
		
		
		
		
	}
	
	@Test
	public void equal2()
	{
//		Assert.assertTrue(true);
//		Assert.assertTrue(false);
		
		
		//Assert.assertFalse(true);
		 //Assert.assertFalse(false);
	}
}
