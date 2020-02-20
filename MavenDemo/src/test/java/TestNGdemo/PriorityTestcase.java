package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PriorityTestcase {
  @Test(priority=3,invocationCount=3,invocationTimeOut=2)
  public void testcase1() {
	  System.out.println("Test Case 1");
  }
	
  @Test(priority=1,invocationCount=3,invocationTimeOut=5)
  public void testcase2() {
	  System.out.println("Test Case 2");
  }
  @Test(priority=2,description= "This is Logout of the application")
  public void testcase3() {
	  System.out.println("Test Case 3");
  }
  }
  