package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigReader {
	@Test

	public static void ReadDataFromConfig() throws Exception
	{
	//	Properties props = new Properties();
		
		//String path ="./config.properties";
		
		//FileInputStream fs = new FileInputStream(path);
		
		//props.load(fs);
		
	//	String url = props.getProperty("siteurl");
		
	//	System.out.println(url);
		
		
	WebDriverManager.chromedriver().setup();
		
	ChromeOptions options = new ChromeOptions();
		
	WebDriver driver = new ChromeDriver(options);
		
	driver.manage().window().maximize();
		
//	driver.get("https://www.google.com/");
	
	String url =ConfigUtilityMethod.readData("siteurl1");
	String url1=ConfigUtilityMethod.readData("siteurl2");
	String url2 =ConfigUtilityMethod.readData("siteurl3");
	String url3 =ConfigUtilityMethod.readData("siteurl4");
	String url4 =ConfigUtilityMethod.readData("siteurl5");

	driver.get(url);
	driver.get(url1);		
	driver.get(url2);		
	driver.get(url3);		
	driver.get(url4);		
	
	}
	
}
