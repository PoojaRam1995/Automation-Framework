package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test

public class SoftAssertion {

	public void softAssert()
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		String actualResult = driver.getTitle();
		String expectedResult = "Log in to Facebook";
		System.out.println("Before Assertion");
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult,"if test case is fail file the bug");

		System.out.println("After Assertion");
		sa.assertAll();


	}

}
