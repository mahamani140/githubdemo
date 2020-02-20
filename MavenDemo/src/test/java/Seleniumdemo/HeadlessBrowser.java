package Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	@Test
	public void test()
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://hatchful.shopify.com/");
		System.out.println(driver.getTitle());
	}

}
