package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsClass {
	@Test
	public void CaptureShots() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		 WebDriver driver= new ChromeDriver(options);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.saucedemo.com");
		 
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("Pooja");
		ScreenShotsMethod.captureDynamicScreenShot(driver, "capture1");
		
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Ramteke");
		ScreenShotsMethod.captureDynamicScreenShot(driver, "capture2");
		

			}
	
	

}
