package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	@Test
	public void launchChromeBrowser()
	{


		//WebDriverManager.chromedriver().setup();

		//  ChromeOptions options = new ChromeOptions();

		//	WebDriver driver =new ChromeDriver(options);
		//driver.manage().window().maximize();
		//	driver.get("https://www.google.com/");




		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/signup");


		WebElement firstName = driver1.findElement(By.name("firstname"));
		firstName.sendKeys("Jenny");

		//WebElement firstName1= driver1.findElement(By.id("u_0_b_NG"));
		//firstName1.sendKeys("Pooja");


		//WebElement firstName2= driver1.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		//firstName2.sendKeys("Radhika");



		WebElement Surname  =driver1.findElement(By.name("lastname"));
		Surname.sendKeys("Anderson");

		//WebElement Surname1  =driver1.findElement(By.className("inputtext _58mg _5dba _2ph-"));
		//Surname1.sendKeys("Ander");


		WebElement MobileNumber  =driver1.findElement(By.name("reg_email__"));
		MobileNumber.sendKeys("8956143633");

		WebElement NewPassword  = driver1.findElement(By.xpath("//input[@id='password_step_input']"));
		NewPassword .sendKeys("Jenny@95");

		WebElement day  = driver1.findElement(By.xpath("//select[@name='birthday_day']"));
		Select selectDay = new Select(day); // select dropdown
		selectDay.selectByVisibleText("19");


		WebElement month  = driver1.findElement(By.xpath("//select[@name='birthday_month']"));
		Select selectMonth = new Select(month); 
		selectMonth.selectByVisibleText("Sep");


		WebElement year  = driver1.findElement(By.xpath("//select[@name='birthday_year']"));
		Select selectYear = new Select(year); 
		selectYear.selectByVisibleText("1997");

		//driver1.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("18");//bootstrap dropdown

		//driver1.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Sep");//bootstrap dropdown
		//driver1.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1997");//bootstrap dropdown

	//	List<WebElement> dayValues = driver1.findElements(By.xpath("//*[@name='birthday_day']//option"));

	//	for(WebElement Day: dayValues)
	//	{
	//	String msg =Day.getText();
	//	System.out.println(msg);
	//	if(dayValues.equals("20"));
	//	{
	//	Day.click();
	//	}
	//	}
		//List<WebElement> monthValues = driver1.findElements(By.xpath("//*[@name='birthday_month']//option"));

		//for(WebElement Month: monthValues)
		//{
		//String msg =Month.getText();
		//System.out.println(msg);
		//if(monthValues.equals("july"));
		//{
		//Month.click();

		//	}}
		//List<WebElement> yearValues = driver1.findElements(By.xpath("//*[@id='year']//option"));

		//for(WebElement day: yearValues)
		//{
		//String dayValues =day.getText();
		//System.out.println(dayValues);
		//if(dayValues.equals("2012"));
		//	{
		//day.click();

		//}}

		driver1.findElement(By.xpath("//*[text()='Female']")).click();  //bootstrap dropdown

		WebElement msg =driver1.findElement(By.xpath("//*[text()='Female']"));
		String message = msg.getText();
		System.out.println(message);
		String expectedMessage ="Female";
		if
		(expectedMessage.equals(message))
		{
			System.out.println("Test case Pass");
		}
		else
		{System.out.println("Test case Fail");

		}
		//WebElement link = driver1.findElement(By.linkText("Already have an account?"));
		//link.click();

	}

















































}