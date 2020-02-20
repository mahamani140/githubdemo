package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).isDisplayed());
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		
	}

}
