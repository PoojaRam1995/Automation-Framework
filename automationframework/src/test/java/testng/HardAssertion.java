package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertion {
	WebDriver driver;
	@Test(priority = 1)
	public void HardAssert()
	{
	
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	String actualResult = driver.getTitle();
	String expectedResult = "Log in to Facebook";
	System.out.println("Before Assertion");
	Assert.assertEquals(actualResult, expectedResult,"is test case failed file the bug");
	
	System.out.println("After Assertion");


	}
	
	@Test(priority = 2)
	
	public void ValidateText()
	{
		String actualText = driver.findElement(By.xpath("//*[text()='Sign up for Facebook']")).getText();
		boolean  isPresent=actualText.contains("Sign up");
		
		Assert.assertTrue(isPresent,"if test case is fail file the bug");
		Assert.assertFalse(false);
	}
	@Test(priority = 3)
	
	public void failedTestCases()
	{
		Assert.fail("Failed the test cases deliberately");
	}
	
		

	
	
}
