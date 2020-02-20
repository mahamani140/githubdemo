package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	

	private static final TimeUnit TimeUnitSeconds = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnitSeconds);
		
		//To select the day from dropdown list
		Select day =   new Select (driver.findElement(By.id("day")));
		day.selectByIndex(23);
		driver.manage().timeouts().implicitlyWait(5,TimeUnitSeconds);

		
		Select month =   new Select (driver.findElement(By.id("month")));
		month.selectByVisibleText("Mar");
		driver.manage().timeouts().implicitlyWait(5,TimeUnitSeconds);

		
		Select year =   new Select (driver.findElement(By.id("year")));
		year.selectByVisibleText("1998");
		driver.manage().timeouts().implicitlyWait(5,TimeUnitSeconds);

		
		driver.findElement(By.className("_58mt")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnitSeconds);

		
		
		
		
	}

}
