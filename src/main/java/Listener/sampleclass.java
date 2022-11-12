package Listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.listnr.class)
public class sampleclass 
{
	@Test
	public void logintest()
	{
		System.out.println("login-test pass");
		Assert.assertTrue(true);
	}
	
	@Test
	public void logout()
	{
		System.out.println("login test fail");
		Assert.assertTrue(false);
	}

}
