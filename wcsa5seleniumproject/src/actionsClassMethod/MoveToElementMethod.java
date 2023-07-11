package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
		// use to perform mouseover action
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");     // launch bluestone web application
		
		driver.findElement(By.id("denyBtn")).click(); // handle the popup
		
	    //driver.findElement(By.partialLinkText("Watch Jewellery")).click();// EXCEPTION
		
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		
		// to perform mouse action on webelement
	    
		Actions act = new Actions(driver);
	  
		// to perform mouseHover action
	     
	    act.moveToElement(target).perform();
	     
	    driver.findElement(By.xpath("//a[.='Band']")).click();
	     
		
	}

}
