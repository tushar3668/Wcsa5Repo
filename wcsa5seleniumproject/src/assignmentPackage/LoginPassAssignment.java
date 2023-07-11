package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPassAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		// to identify webelement we use locators
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("tusharkanase3668@gmail.com");
        Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("tmk");
		Thread.sleep(2000);
	

	}

}
