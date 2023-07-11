package assignmentPackage;

import java.io.Closeable;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginZomato {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("tushar");
		driver.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("tushar@gmail.com");
		driver.findElement(By.className("sc-1o2pknd-1 iPRmnw")).click();
		driver.findElement(By.className("sc-1kx5g6g-2 eXneOi")).click();

	}

}
