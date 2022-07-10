package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Wait;

public class GrowwHomePage 
{
	@FindBy (xpath = "//div[text()='Mutual Funds']") private WebElement mutualFundsTab;
	
	public GrowwHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clcikOnMututalFund(WebDriver driver)
	{
		Wait.explicitWait(driver, mutualFundsTab);
		
		Actions action = new Actions(driver);
		action.moveToElement(mutualFundsTab);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.click()
		.perform();
	}
	
}
