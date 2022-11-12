package Keywords;

import org.testng.annotations.Test;

public class Timeout 
{
	@Test
	public void TestA()
	{
		System.out.println("Test-A");
	}
	
	@Test
	public void TestB()
	{
		System.out.println("Test-b");
	}
	
	@Test(timeOut=1000)
	public void TestC()
	{
		System.out.println("Test-c");
	}
}
