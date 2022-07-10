package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.GrowwHomePage;
import utility.BaseClass;

@Listeners(utility.ListnersClass.class)
public class GrowwHomePageTest extends BaseClass
{
	 @Test
	 public void enterMutualFund()
	 {
		 GrowwHomePage growwHomePage = new GrowwHomePage(driver);
		 growwHomePage.clcikOnMututalFund(driver);
	 }
}
