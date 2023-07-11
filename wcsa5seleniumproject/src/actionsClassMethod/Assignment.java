package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.id("goldCoins"));

		//to perform mouse action on webpage
		Actions act = new Actions(driver);
		
		// to perform mouseHover action
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']")).click();
		boolean image = driver.findElement(By.id("details-top-right")).isDisplayed();
		System.out.println(image);
		driver.close();
	}

}
