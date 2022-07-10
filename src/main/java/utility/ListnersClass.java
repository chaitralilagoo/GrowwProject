package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass extends BaseClass implements ITestListener
{
	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName()+" Listners:onTestStart");
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName()+" Listners:onTestFailure");
		try 
		{
			ScreenShot.takeScreenShot(driver, result.getName());
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{			
			e.printStackTrace();
		}
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+" Listners:onTestSuccess");
	}
}
