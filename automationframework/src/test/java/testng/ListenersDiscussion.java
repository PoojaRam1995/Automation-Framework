package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenersDiscussion
{
	WebDriver driver;
	@Test
	public void Listeners()
	{
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	 driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");


}
	
@Test
 
public void SearchProject()
{
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).sendKeys("Washing Machines");
	Actions act=  new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();

}
} 
