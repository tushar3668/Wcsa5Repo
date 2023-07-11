package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignup {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.swiggy.com/");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.linkText("Sign up")).click();
	   driver.findElement(By.id("mobile")).sendKeys("9595982160");
	   Thread.sleep(2000);
	   driver.findElement(By.id("name")).sendKeys("tushar");
	   Thread.sleep(2000);
	   driver.findElement(By.id("email")).sendKeys("tusharkanase3668@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.className("a-ayg")).click();
	   

	}

}
