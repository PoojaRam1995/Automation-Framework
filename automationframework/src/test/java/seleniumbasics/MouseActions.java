package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class MouseActions {


	public void MouseAct()
	{



		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		//WebElement doubleClickButton= driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement doubleClickButton= driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		js.executeScript("arguments[0].scrollIntoView();" ,doubleClickButton);
		//doubleClickButton.click();
		
		Actions act = new Actions(driver);

		act.doubleClick(doubleClickButton).perform();
		//act.moveToElement(doubleClickButton).perform();
		
		
		
		WebElement rightClickButton=driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		
		act.contextClick(rightClickButton).perform();
		
		WebElement clickButton=driver.findElement(By.xpath("//*[text()='Click Me']"));
		
		clickButton.click();





	}
}