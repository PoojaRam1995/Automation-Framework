package utility;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWebsite {
	
	
	@Test	
	public void LaunchSite() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	

//		String pageTitle=driver.getTitle();
//		String expectedTitle = "Mobile phones";
//		System.out.println("Before Assertion");
//		//Assert.assertEquals(pageTitle, expectedTitle,"is test case failed file the bug");
//
//		System.out.println("After Assertion");


		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile Phones");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		

		

		String phone=driver.getWindowHandle();
		System.out.println(phone);


		WebElement redmi= driver.findElement(By.xpath("//*[text()='Redmi 13C (Starfrost White, 4GB RAM, 128GB Storage) | Powered by 4G MediaTek Helio G85 | 90Hz Display | 50MP AI Triple Camera']"));
		redmi.click();

		
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
		
		

//		//SoftAssert sa = new SoftAssert();
//		sa.assertEquals(pageTitle, expectedTitle,"if test case is fail file the bug");
//
//		System.out.println("After Assertion");
//		sa.assertAll();
		
		
		
	    String currentTitle=driver.getCurrentUrl();
		System.out.println(currentTitle);
		



		JavascriptExecutor js1  = (JavascriptExecutor)driver;

		WebElement offer = driver.findElement(By.xpath("//*[@id='variation_color_name']"))	;					

		js1.executeScript("arguments[0].scrollIntoView();",offer);
		offer.click();
		

		driver.findElement(By.xpath("//*[@title='Click to select White']")).click();

		driver.findElement(By.xpath("//*[@id='size_name_1']")).click();

	driver.findElement(By.xpath("//*[@title='Buy Now']")).click();

	}

}
