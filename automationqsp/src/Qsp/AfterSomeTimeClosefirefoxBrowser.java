package Qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AfterSomeTimeClosefirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(10000);
        driver.close();
	}

}
