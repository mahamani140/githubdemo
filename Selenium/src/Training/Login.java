package Training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		 driver.findElement(By.className("nav__button-secondary")).click();
		 driver.findElement(By.id("username")).sendKeys("mahamani140@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("linkedin1");	
		 driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click(); 

		 //driver.findElement(By.linkText("Join now")).click();
		
		
		//partial link text for join now button
		//driver.findElement(By.partialLinkText("Join")).click();
		
		
		//xpath for post a job button
		driver.findElement(By.xpath("//*[@class='pill pill--talent-finder-cta']")).click();
		
		//using 'or' and 'and' in xpath
		driver.findElement(By.xpath("//*[@id='first-name-ember18' and @type='text']")).sendKeys("Mahalakshmi");
		driver.findElement(By.xpath("//*[@id='last-name-ember18' or @input='lastName']")).sendKeys("Mourouguessin");
		
		
		//xpath using contains method
		driver.findElement(By.xpath("//*[contains(@id,'email-address-ember18')]")).sendKeys("mahamani140@gmail.com");
		
		//xpath using starts with method
		driver.findElement(By.xpath("//label[starts-with(@type,'password')")).sendKeys("123");
		
		driver.findElement(By.xpath("//label[starts-with(@placeholder,'First Name')")).sendKeys("123");
		
		//taking screenshots
		//TakesScreenshot file
		
	}

}
