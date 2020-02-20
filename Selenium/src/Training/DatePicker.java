package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		//To maximize the Screen
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='db text-trans-uc']")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")).click();
		
	}

}
