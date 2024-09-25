package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Debug;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	@Test
	
	public void KeyboardActions()
	{
		

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String parentid =driver.getWindowHandle();
		System.out.println(parentid);
		driver.findElement(By.xpath("//*[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//*[@onclick='multiwindow()']")).click();

		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);

		String[]allWinid = new String[3];

		int i =0;
		for(String id:allid)
		{
			allWinid[i]=id;
			i++;
		}
		driver.switchTo().window(allWinid[1]);

		driver.findElement(By.xpath("//img[@src='enter.png']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement firstName = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		
		act.sendKeys(firstName,"Pooja").sendKeys(Keys.TAB).sendKeys("Ramteke").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Chandrapur").sendKeys(Keys.TAB).sendKeys("Pooja11@gmail.com").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("9623387584").build().perform();
		driver.findElement(By.xpath("//input[@value='Male']")).click();

		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement languageButton = driver.findElement(By.xpath("//*[@id='msdd']"));

		js.executeScript("arguments[0].scrollIntoView();", languageButton);

		languageButton.click();

		driver.findElement(By.xpath("//*[text()='English']")).click();
		
		driver.findElement(By.xpath("//select[@ng-model='Skill']")).sendKeys("Android");//bootstrap dropdown
		
		act.sendKeys(Keys.TAB).sendKeys("1918").sendKeys(Keys.TAB).sendKeys("October").build().perform();




	//	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
		
		
		
	}

}
