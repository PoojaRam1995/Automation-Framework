package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	
	@Test
	
	public void checkboxTest()
	{
		System.out.println("check the Test");
	}
	
	@Test
	public void SiteTest()
	{
		System.out.println("Open the site");
	}
	@BeforeMethod
	
	public void beforeMethod()
	{
		System.out.println("Before Method Annotation");
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		System.out.println("After method Annotation");
	}
	
	@BeforeClass
	
	public void beforeClass()
	{
		System.out.println("Before class Annotation ");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("After Class Annotation");
	}

}
