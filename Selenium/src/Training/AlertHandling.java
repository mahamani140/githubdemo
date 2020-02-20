package Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept(); // clicking ok button
		//a.dismiss(); //clicking cancel button
		//a.sendKeys("Maha"); //passing values
		//driver.close();
		
	
	}

}
