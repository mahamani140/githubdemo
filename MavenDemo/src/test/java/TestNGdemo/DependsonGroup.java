package TestNGdemo;

import org.testng.annotations.Test;

public class DependsonGroup {
	@Test(groups= {"functional testing","retesting"})
	public void testcase1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(groups= {"functional testing","smoke testing"})
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(groups= {"regression testing","smoke testing"})
	public void testcase3()
	{
		System.out.println("Test Case 3");
	}

}
