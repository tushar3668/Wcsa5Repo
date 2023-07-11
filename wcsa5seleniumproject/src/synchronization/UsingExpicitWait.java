package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExpicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	    driver.get("http://127.0.0.1/login.do;jsessionid=8i1e39pr6cgsp");
	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	    String actualTitleOfLoginPage=driver.getTitle();
	    if(actualTitleOfLoginPage.equals("actitime - Login"))
	    {
	    	System.out.println("Title is matched , Test case is passed");
	    	driver.findElement(By.name("username")).sendKeys("admin");
	    	driver.findElement(By.id("loginButton")).click();
	    }
	    else
	    {
	    	System.out.println("exception");
	    }
	    
	    String actualTitleOfHomePage=driver.getTitle();
	    if(actualTitleOfHomePage.equals("actitime - Enter Time-Track"))
	    {
	    	System.out.println("Title is matched , Test case is passed");
	    	driver.findElement(By.linkText("Logout")).click();
	    }
	    else
	    {
	    	System.out.println("Title is not matched , Test case is fail");
	    }
      
	} 

}
