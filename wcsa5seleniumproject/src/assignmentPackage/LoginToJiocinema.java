package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToJiocinema {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jiocinema.com/?onboard=login-phone");
		
		driver.findElement(By.id(":r2:")).sendKeys("9595982160");
		Thread.sleep(2000);
		driver.findElement(By.className("mui-style-1ja1tam-submit")).click();
		
	}

}
