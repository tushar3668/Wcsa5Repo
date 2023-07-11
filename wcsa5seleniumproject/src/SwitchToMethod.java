import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver drive=new ChromeDriver();
	
	drive.manage().window().maximize();
	drive.switchTo().activeElement().sendKeys("selenium");

	}

}
