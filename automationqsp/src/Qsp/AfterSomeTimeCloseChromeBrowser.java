package Qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class AfterSomeTimeCloseChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.close();
		

	}

}
