package test;



import org.testng.annotations.Test;

import pom.GrowwLoginPage;
import utility.BaseClass;

public class GrowwLoginTest extends BaseClass
{
	@Test
	public void login()
	{
		GrowwLoginPage growwLoginPage = new GrowwLoginPage(driver);
		growwLoginPage.clickOnLogin();
		growwLoginPage.enterEmailId(emailId);
		growwLoginPage.clickOnContinue();
		growwLoginPage.enterPassword(driver,password);
		growwLoginPage.clickOnSubmit();
		growwLoginPage.enterPin(pin);
	}
	
}
