package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class IFrameClass {

	public void IFrameActions() throws Exception

	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new	ChromeOptions();
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable");

		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame);

		

		Actions act = new Actions(driver);
		 WebElement draggableBox = driver.findElement(By.xpath("//*[@id='draggable']"));
		act.clickAndHold(draggableBox).moveByOffset(20,60).release(draggableBox).build().perform();
		 Thread.sleep(2000);

	  act.clickAndHold(draggableBox).moveByOffset(30,70).release(draggableBox).build().perform();
		 Thread.sleep(2000);

		 act.clickAndHold(draggableBox).moveByOffset(40,90).release(draggableBox).build().perform();

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

		driver.get("https://jqueryui.com/droppable");

	WebElement iFrame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame1);

		WebElement draggableBox1 =driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppableBox1 =driver.findElement(By.xpath("//*[@id='droppable']"));

		act.clickAndHold(draggableBox1).moveToElement(droppableBox1).release(draggableBox1).build().perform(); 
		Thread.sleep(2000);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		driver.get("https://jqueryui.com/resizable");

		WebElement iFrame2 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame2);
		WebElement resizable = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

		act.clickAndHold(resizable).moveByOffset(30,18).release(resizable).build().perform();
		Thread.sleep(2000);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		driver.get("https://jqueryui.com/selectable");

		WebElement iFrame3 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame3);
			WebElement selectable = driver.findElement(By.xpath("//*[@id='selectable']"));
		 driver.findElement(By.xpath("//li[text()='Item 4']")).click();
		 Thread.sleep(2000);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		driver.get("https://jqueryui.com/sortable");

		WebElement iFrame4 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iFrame4);

		List<WebElement> lists = driver.findElements(By.xpath("//ul[@id='sortable']"));

			WebElement Element= driver.findElement(By.xpath("//li[text()='Item 1']"));

		Thread.sleep(2000);
		 WebElement dragElement=driver.findElement(By.xpath("//li[text()='Item 7']"));


		act.clickAndHold(dragElement).dragAndDrop(dragElement,Element).build().perform();
		Thread.sleep(2000);
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 driver.switchTo().parentFrame();
		 JavascriptExecutor js = (JavascriptExecutor)driver;

		 WebElement positionButton = driver.findElement(By.xpath("//a[text()='Position']"));

		 js.executeScript("arguments[0].scrollIntoView();" ,positionButton);
		positionButton.click();

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		driver.get("https://www.facebook.com/signup");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		Actions act1=new Actions(driver);
		
		act.sendKeys(firstName,"Pooja").sendKeys(Keys.TAB).sendKeys("Ramteke").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("8999773633").sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		WebElement passwordButton= driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		js1.executeScript("arguments[0].scrollIntoView();" ,passwordButton);
		passwordButton.click();
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pooja@0711"); 

	}}







