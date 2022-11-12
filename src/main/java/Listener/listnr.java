package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnr implements ITestListener

{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is started");
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is successfully start");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("As test is fail take screenshot");
	}

}
