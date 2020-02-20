package Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	//private static final TimeUnit TimeUnitSeconds = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnitSeconds);
		
		
		WebElement a=driver .findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[2]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[3]/ul/li[7]/a/span"));
		
		Actions action = new Actions(driver);
		action.moveToElement(a).click();
		action.moveToElement(b).click().build().perform();
		

	}

}
