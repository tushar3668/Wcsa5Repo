package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneswitchTo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.bluestone.com/");
	
	
	driver.findElement(By.id("denyBtn")).click();
	Thread.sleep(2000);	
	
//	driver.switchTo().frame("fc_widget");                        //2nd way
//	driver.findElement(By.id("chat-icon")).click();
	
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));   //3rd way
	driver.switchTo().frame(frameElement);
	driver.findElement(By.id("chat-icon")).click();
	
	
}
}
