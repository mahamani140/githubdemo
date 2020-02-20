package TestNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods {
	@Test
	public void login()
	{
		System.out.println("Login into Application");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void search()
	{
		System.out.println("Searching the Element");
		Assert.assertEquals("abc", "xyz");
	}
	
	@Test(dependsOnMethods= {"search"},alwaysRun=true)
	public void logout()
	{
		System.out.println("Logout the Application");
	}
	
}
