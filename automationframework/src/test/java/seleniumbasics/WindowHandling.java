package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling
{
	@Test
	public void launchChromeBrowser()
	{


		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver =new ChromeDriver(options);
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

		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Rahul");

		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Pandey");

		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Mumbai,Maharashtra");

		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("RahulPandey123@gmail.com");

		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9876543210");

		driver.findElement(By.xpath("//input[@value='Male']")).click();

		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement languageButton = driver.findElement(By.xpath("//*[@id='msdd']"));

		js.executeScript("arguments[0].scrollIntoView();", languageButton);

		languageButton.click();

		driver.findElement(By.xpath("//*[text()='English']")).click();
		//*[@id='select2-country-container']
		//driver.switchTo().alert().accept();		

		driver.findElement(By.xpath("//select[@ng-model='Skill']")).sendKeys("Android");//bootstrap dropdown


		WebElement selectCountry=driver.findElement(By.xpath("//*[text()='Select Country']"));
		selectCountry.click();

		WebElement selCountry=driver.findElement(By.xpath("//*[@class='selection']"));

		selCountry.click();
		driver.findElement(By.xpath("//*[text()='India']")).click();


			driver.findElement(By.xpath("//*[@id='yearbox']")).sendKeys("1916");//bootstrap dropdown

			driver.findElement(By.xpath("//*[@ng-model='monthbox']")).sendKeys("November");//bootstrap dropdown

			driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys("Pandey@789");//bootstrap dropdown

			driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys("Pandey@789");//bootstrap dropdown

			driver.findElement(By.xpath("//*[@id='daybox']")).sendKeys("23");//bootstrap dropdown

		//driver.findElement(By.xpath("//*[@id='submitbtn']")).click();//bootstrap dropdown

		//driver.findElement(By.xpath("//*[@id='Button1']")).click();//bootstrap dropdown
			driver.switchTo().newWindow(WindowType.TAB);
			
			driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//*[text()='Open Seperate Multiple Windows']")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);

		       driver.get("https://www.facebook.com/signup");


	}}
