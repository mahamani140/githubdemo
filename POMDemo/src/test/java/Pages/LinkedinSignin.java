package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinSignin {
	WebDriver driver;
	By username=By.id("username");
	By password=By.id("password");
	By signinbutton =By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	public LinkedinSignin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signInToApp_username(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}

	public void signInToApp_password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void signToApp_Signinbutton()
	{
		driver.findElement(signinbutton).click();
	}
}
