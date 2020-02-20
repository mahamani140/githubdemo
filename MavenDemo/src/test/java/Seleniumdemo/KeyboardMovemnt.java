package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardMovemnt {
	@Test
	public void key()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("mahamani140@gmail.com");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("123").perform();
		//action.sendKeys(Keys.ENTER).perform();
		//or We can use "Return" instead of "Enter"
		action.sendKeys(Keys.RETURN).perform();
	}

}
