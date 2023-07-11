package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException  {
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		
      new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();//upcast
		
		Thread.sleep(2000);
		
		driver.close();// to close
		

	}

}
