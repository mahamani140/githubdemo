package Seleniumdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;


public class JunitTestCase {
	@Test
	public void testcase1()
	{
		System.out.println("Test case 1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}
	@Before
	
		public void before()
		{
			System.out.println("Before Method");
		}
	@After
		public void after()
		{
		System.out.println("After Method");
	}
	@BeforeClass
	public static void BeforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public  static void AfterClass()
	{
		System.out.println("After Class");
	}

}
