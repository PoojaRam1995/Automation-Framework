package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class EnterActions {
	
	public void keyActions()
	{
		
	
	
	WebDriverManager.chromedriver().setup();

	ChromeOptions options = new ChromeOptions();

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
		
		//Actions act=  new Actions(driver);
		//act.sendKeys(Keys.ENTER).build().perform();
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//*[@class='pcTkSc']//*[text()='selenium']"));
		
		for (WebElement results: searchResults)
		{
			String textResult= results.getText();
		
		System.out.println(textResult );
		}


}}
