package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapping {
	protected WebDriver driver;
	public void launchApplication(String browser,String url)
	{
		try {
			if (browser.equalsIgnoreCase("firefox")) //To Launch with firefox browser
				{
				//System.setProperty("webdriver.gecko.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\geckodriver.exe");
				driver = new FirefoxDriver();
			} 
			else if (browser.equalsIgnoreCase("chrome")) //To Launch with Chrome browser 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize(); //To maximize the Window
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Time to wait for Loading the pages
			driver.get(url); //To Get URL 
		
		} 
		catch (WebDriverException e) //To display the Exception Message
		{
			System.out.println(" Browser Could Not Be Launched");
		}
	
	}
   public void quit(){
		
		driver.close(); //To close the Page
		
   }
	}
	


