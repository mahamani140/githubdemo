package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.LinkedinSignin;

public class SigninTestCase extends WrapperEx {
	@BeforeClass
	public void startUp()
	{
		launchApplication("chrome", "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	@Test
	public void signin()
	{
		LinkedinSignin spage=new LinkedinSignin(driver);
		spage.signInToApp_username("mahamani140@gmail.com");
		spage.signInToApp_password("123");
		spage.signToApp_Signinbutton();
	}
	@AfterClass
	public void close()
	{
		quit();
	}

}
