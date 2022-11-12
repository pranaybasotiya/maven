package Keywords;

import org.testng.annotations.Test;

public class priority 
//priority,invocationcount,enabled
{
	@Test(priority=4,invocationCount=4)
	public void TestA()
	{
		System.out.println("Test-A");
	}
	
	@Test(priority=3,invocationCount=2)
	public void TestB()
	{
		System.out.println("Test-b");
	}
	
	@Test(priority=2,invocationCount=6,enabled=false)
	public void TestC()
	{
		System.out.println("Test-c");
	}
	
	@Test(priority=1,invocationCount=0)
	public void Testd()
	{
		System.out.println("Test-d");
	}
}
