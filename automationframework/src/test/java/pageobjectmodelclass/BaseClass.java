package pageobjectmodelclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	PageClass pc;
	
	@BeforeSuite
	public void initBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	


}
	@BeforeClass
	public void CreateObject()
	{
		 pc = new PageClass(driver);
	}
}
