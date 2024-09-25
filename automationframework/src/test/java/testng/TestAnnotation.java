package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
public class TestAnnotation {
	
	@BeforeTest
	
	public void beforeTest()
	{
		System.out.println("Before Test Annotation");
	}
	
	@AfterTest
	
	public void afterTest()
	{
		System.out.println("After Test Annotation");
	}
	
	
	@org.testng.annotations.BeforeSuite
	
	public void BeforeSuite()
	{
		System.out.println("Before Suite Annotation");
	}
	
	@AfterSuite
	
	public void Aftersuite()
	{
		System.out.println("After suite Annotation");
	}
}
