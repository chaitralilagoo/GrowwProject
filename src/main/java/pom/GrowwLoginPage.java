package pom;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Wait;

public class GrowwLoginPage 
{
	@FindBy (xpath = "//span[text()='Login/Register']") private WebElement login;
	@FindBy (xpath = "//input[@id='login_email1']") private WebElement emailId;
	@FindBy (xpath = "//span[text()='Continue']") private WebElement conti;
	@FindBy (xpath = "//input[@id='login_password1']") private WebElement password;
	@FindBy (xpath = "//span[text()='Submit']") private WebElement submit;
	@FindBy (xpath = "//input[@type='number']") private List<WebElement> pin;
	@FindBy (xpath = "//input[@type='number'][1]") private WebElement pin1;
	
	public GrowwLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void enterEmailId(String emailId)
	{
		this.emailId.sendKeys(emailId);
	}
	public void clickOnContinue()
	{
		conti.click();
	}
	public void enterPassword(WebDriver driver ,String password)
	{
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
//		wait.until(ExpectedConditions.visibilityOf(this.password));
		Wait.explicitWait(driver, this.password);
		this.password.sendKeys(password);
		System.out.println(submit.isEnabled());
	}
	public void clickOnSubmit()
	{
		if(submit.isEnabled())
			submit.click();
	}
	public void pin1(String str)
	{
		this.pin1.sendKeys(str);
	}
	public void enterPin(String pin)
	{
		for(int i = 0; i<this.pin.size(); i++)
		{			
			//String str = Character.toString(pin.charAt(i));
			this.pin.get(i).sendKeys(Character.toString(pin.charAt(i)));
		}
	}
}