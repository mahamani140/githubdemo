package Training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fireboxlogin {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\BLTuser.BLT1202\\Downloads\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
}
}
