package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		new ChromeDriver().close();

	}

}
