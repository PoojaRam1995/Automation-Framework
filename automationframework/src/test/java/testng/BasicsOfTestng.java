package testng;

import org.testng.annotations.Test;

public class BasicsOfTestng {
	
//	 Features of TestNG.
	
//	1.We can define the testcase.
//	2.Execution sequences can be defined with TestNG.
//	3.We can perform the actions based on the result of a testcase.
//  4.Wecan execute the test cases in parallel through TestNG.
//  5.We can have a report after every execution.
//	6.We can also define the pre and post conditon of a test case.
	
	
	@Test
	
	public void TestCase1()
	{
		System.out.println("TestCase1 is Executing");
	}
	
	
	@Test
	
	public void TestCase2()
	{
		System.out.println("TestCase2 is Executing");
	
	}
	}
