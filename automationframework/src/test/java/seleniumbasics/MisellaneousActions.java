package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MisellaneousActions
{
	@Test
	public void MisellaneousAct()
	{
	WebDriverManager.chromedriver().setup();

	ChromeOptions options = new ChromeOptions();

	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Windows.html");
	
	String pageTitle=driver.getTitle();
	System.out.println(pageTitle);
	
	String expectedTitle="Frames & window";
    if(expectedTitle.equals(pageTitle))
	{
	System.out.println("Test case pass");
    }
	else {
	System.out.println("Test case fails");
	}
	String currentTitle=driver.getCurrentUrl();
	System.out.println(currentTitle);
	
	driver.findElement(By.xpath("//*[text()='Open Seperate Multiple Windows']")).click();
	driver.findElement(By.xpath("//*[@onclick='multiwindow()']")).click();
    Set<String>  allid1= driver.getWindowHandles();
    
    System.out.println(allid1);
    String[]allWinid = new String[3];

	int i =0;
	for(String id:allid1)
	{
		allWinid[i]=id;
		i++;
	}
	driver.switchTo().window(allWinid[1]);
	driver.findElement(By.xpath("//*[@id='enterimg']")).click();
	
	WebElement firstName = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
	
	firstName.sendKeys("Pooja");
	
	firstName.clear();
	
	

	}
	
}

