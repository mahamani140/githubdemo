package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkedInDemo {
	WebDriver driver;
	
	@Test
	public void launchapp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.linkedin.com/");
	}
	
	@Test
	public void perform()
	{
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		driver.findElement(By.id("username")).sendKeys("mahamani140@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	}
	
	@Test
	public void close()
	{
		driver.close();
	}
	
}
