package pojo;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	public static WebDriver openBrowser(String browserName) throws InterruptedException //(String s) throws InterruptedException 
	{
		// lunching browser
		String url = "https://groww.in/";//"https://kite.zerodha.com/";
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = null;
		switch(browserName.toLowerCase())
		{
			case "ie":
					System.setProperty("webdriver.ie.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
					driver = new InternetExplorerDriver();
					break;
			case "firefox":
					System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox\\geckodriver-v0.30.0-win64\\geckodriver.exe");
					driver = new FirefoxDriver();
					break;
			case "chrome":
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-notifications");
					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
					driver = new ChromeDriver(options);

					break;
			case "edge":	
					System.setProperty("webdriver.edge.driver", "C:\\Selenium\\Edge\\msedgedriver.exe");
					driver = new EdgeDriver();
					break;
			default:
					System.out.println("Invalid Browser");
					System.exit(0);
					break;
		}
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.get(url);
		//universal, applicable for every webelement
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		return driver;
	
	}
	 public static void quitBrowser(WebDriver driver)
	 {
		 driver.quit();
	 }
}
