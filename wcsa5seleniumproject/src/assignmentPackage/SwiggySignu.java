package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sample.ToLaunchChromeBrowser;

public class SwiggySignu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobile")).sendKeys("9595982160");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("pratik");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("pratik44@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("a-ayg")).click();
		driver.close();

	}

}
