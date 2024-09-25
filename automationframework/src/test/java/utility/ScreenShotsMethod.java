package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShotsMethod {
	@Test
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts .getScreenshotAs(OutputType.FILE);
		String path ="C:\\ScreenShots\\screenshotA.png";
		File destination = new File(path);
		FileHandler.copy(source,destination);
	}
	
	public static void captureDynamicScreenShot(WebDriver driver ,String fileName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//String path = "C:\\Screenshots\\screenshotA.png";
		String path = System.getProperty("user.dir")+"\\Screenshots\\"+fileName+".png"; 
		File destination = new File(path);
		FileHandler.copy(source, destination);
		
		
	}
		
	
}

