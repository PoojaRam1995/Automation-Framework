package seleniumbasics;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class NewTest {
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		

		driver.findElement(By.xpath("//*[@id='alertButton']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		//WebElement timerAlertBtn=driver.findElement(By.xpath("//*[@type='button']"));
		
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//wait.until(ExpectedConditions.elementToBeClickable(timerAlertBtn));
		
		//timerAlertBtn.click();
		
	//	driver.switchTo().alert().accept();
		
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement confirmBtn = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		js.executeScript("argument[0].scrollIntoView();", confirmBtn);
		confirmBtn.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//*[@id='promtButton']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='promtButton']")).sendKeys("Pooja");
		
		driver.switchTo().alert().accept();
		
		
		//driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		
		//Thread.sleep(2000);
		
	    //driver.switchTo().alert().accept();
				

  }
}
