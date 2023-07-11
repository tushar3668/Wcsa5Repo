package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSpotify {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https%3A%2F%2Fopen.spotify.com%2F");

		
		driver.findElement(By.id("login-username")).sendKeys("tushar");
		Thread.sleep(1000);
		driver.findElement(By.id("login-password")).sendKeys("1521");
		Thread.sleep(1000);
		driver.findElement(By.xpath("Type__TypeElement-sc-goli3j-0 cOJqPq sc-eDvSVe sc-jSUZER itlAHd dbTuyj")).click();
	
		driver.close();

	}

}
