package testng;

import org.testng.annotations.Test;

public class Priority {
	
//	Rules of Priority
//	
//	1.We can define +ve,-ve or 0 as a priority of the test case but it cannot be in fraction.
//	2.The defautl priority of a test case is 0.
//	3.Multiple test cases can have same priority and if we try to execute then those will execute based on the alphabetical order.
	
	
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login to the Application");
	}
	
	@Test(priority=4)
	public void logout()
	{
		System.out.println("Logout to the Application");

	}
	@Test(priority=2)
	public void Home()
	{
		System.out.println("Home Page of the Application");

	}
	@Test(priority=3)
	public void Dashboard()
	{
		System.out.println("Dashboard of the Application");

	}
	@Test(priority= -1)
	public void LaunchBrowser()
	{
		System.out.println("Launch the browser");
	
	}

}
