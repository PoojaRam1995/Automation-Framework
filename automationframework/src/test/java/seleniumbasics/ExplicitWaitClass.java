package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitClass {
	@Test
	
	public void ExplicitWait()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		 WebDriver driver=  new ChromeDriver(options);
		 driver.manage().window().maximize();
		 driver.get("https://app.bugbug.io/sign-up/");
	}

}
