package Shopify;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logos {
	WebDriver driver;
	public void toLaunch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void toClick(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
	public void toValid(String loc,String value)
	{
		driver.findElement(By.name(loc)).sendKeys(value);
	}
	public void screenshots(String path1) throws IOException
	{
		TakesScreenshot snappic = (TakesScreenshot)driver;
		File Source= snappic.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path1));
	}
	public void toReturn(String path3)
	{
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(path3)).click();
		
	}
	public void toNavigate(String path4)
	{
		Actions action = new Actions(driver);
		WebElement a=driver .findElement(By.xpath(path4));
		action.moveToElement(a).click().perform();
		//action.moveToElement(b).click().build().perform();
	}
	public void closeapp()
	{
		driver.close();
	}

}
