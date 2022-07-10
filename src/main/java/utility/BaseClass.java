package utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import pojo.Browser;
import pom.GrowwLoginPage;

public class BaseClass 
{
	public static WebDriver driver;
	public String emailId, password, pin;
	@BeforeMethod
	public void openBrowser() throws InterruptedException 
	{
		driver = Browser.openBrowser("chrome");
		
		GrowwLoginPage growwLoginPage = new GrowwLoginPage(driver);
		growwLoginPage.clickOnLogin();
		growwLoginPage.enterEmailId(emailId);
		growwLoginPage.clickOnContinue();
		growwLoginPage.enterPassword(driver,password);
		growwLoginPage.clickOnSubmit();
		growwLoginPage.enterPin(pin);
	}
	@BeforeClass//(priority = 1)
	public void excelData() throws EncryptedDocumentException, IOException
	{
		emailId = Excel.getData("GrowwCredentials", 0, 1);
		password = Excel.getData("GrowwCredentials", 1, 1);
		pin = Excel.getData("GrowwCredentials", 2, 1);
	}

	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
	}
//	@AfterMethod
//	public void screenShot(ITestResult result) throws InterruptedException, IOException//()
//	{
//		if(result.getStatus() == ITestResult.FAILURE)
//		{
//			ScreenShot.takeScreenShot(driver, "Groww_");
//		}
//	}


}
