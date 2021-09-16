package Qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class closeFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		new FirefoxDriver().close();

	}

}
