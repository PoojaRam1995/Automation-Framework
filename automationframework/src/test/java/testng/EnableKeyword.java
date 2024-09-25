package testng;

import org.testng.annotations.Test;

public class EnableKeyword {
	
	@Test
	public void login()
	{
		System.out.println("Login to the Application");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout to the Application");

	}
	@Test
	public void Home()
	{
		System.out.println("Home Page of the Application");

	}
	@Test
	public void Dashboard()
	{
		System.out.println("Dashboard of the Application");

	}
	@Test (enabled = false)
	public void LaunchBrowser()
	{
		System.out.println("Launch the browser");
	
	}


}
