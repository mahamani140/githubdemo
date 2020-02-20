package Shopify;

import org.openqa.selenium.By;

public class hatchful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logos logo = new Logos();
		logo.toLaunch("https://hatchful.shopify.com/");
		
		// To sign up
		
	//	logo.toClick("//*[@id=\"app\"]/div/main/nav/div/div[2]/div/div/div[2]/button");
	//	logo.toValid("userEmail", "mahamani140@gmail.com");
	//	logo.toValid("userPassword", "123");
		
		//To login
		
		/* logo.toClick("//*[@id=\"app\"]/div/main/nav/div/div[2]/div/div/div[1]/button");
		logo.toValid("userEmail", "mahamani140@gmail.com");
		logo.toValid("userPassword", "123");
		logo.toClick("//*[@id=\\\"app\\\"]/div/main/section/div/p[2]/button");
		logo.closeapp(); */
		
		logo.toClick("//*[@id=\"app\"]/div/main/section/div/p[2]/button");
		logo.toClick("//*[@id=\"app\"]/main/section/div/span/div/div/div/div[1]/div/div/div/div[2]/button/div/div/div[1]/img");
		logo.toClick("//*[@id=\"app\"]/main/div[1]/div/button");
		logo.toClick("//*[@id=\"app\"]/main/div[1]/div/button");
		logo.toClick("//*[@id=\"app\"]/main/section/div/span/div/div/div/div[1]/div/div/div/div[9]/button/div/div/div[2]");
		logo.closeapp();
		
		
	}

}
