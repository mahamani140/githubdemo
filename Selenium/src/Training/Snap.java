package Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		TakesScreenshot snappic = (TakesScreenshot)driver;
		File Source= snappic.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("C:/Users/BLTuser.BLT1202/eclipse-workspace/Selenium/screenshots/ss1.png"));
				
	}

}
