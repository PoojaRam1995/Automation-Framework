package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DependsOnMethodkeyword {
	WebDriver driver;
	
	@Test(priority =1)
	public void OpenBrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	@Test(priority=2)
	
	public void Homepage()
	{
	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
	Actions act = new Actions(driver);
	
	act.sendKeys(Keys.ENTER).build().perform();
	}
	

}
