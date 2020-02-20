package Training;

import java.io.IOException;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethods wm = new WrapperMethods();
		wm.launchapp("https://in.linkedin.com/");
		wm.clickbyxpath("/html/body/nav/a[3]");
		wm.enterById("username", "mahamani140@gmail.com");
		wm.enterById("password", "123");
		wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		wm.screenshot("C:/Users/BLTuser.BLT1202/eclipse-workspace/Selenium/screenshots/li1.png");
		wm.closeapp();
	}

}
