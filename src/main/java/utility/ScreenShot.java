package utility;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{
	public static void takeScreenShot (WebDriver driver, String str)/*, String dt)*/ throws InterruptedException, IOException 
	{
		String dt = date();//currentDateTime();//
						//interface		//interface------------implemented by chromedriver class
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\Velocity\\screeshot\\" + str + dt + ".png");	
		FileHandler.copy(source, destination);
	}
	public static String date()
	{
		//SimpleDateFormat
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ ss");
		Date currDateTime = new Date();
		return dateFormat.format(currDateTime);
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
//		LocalDateTime currentTime = LocalDateTime.now();
//		String d = dtf.format(currentTime);
//		return d;
		
	}
}

