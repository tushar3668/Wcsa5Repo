package omayoassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindow {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   	    WebDriver driver=new ChromeDriver();
	   		driver.manage().window().maximize();
	   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   		driver.get("https://omayo.blogspot.com/");
	   		
	   		driver.findElement(By.partialLinkText("Open a popup window")).click();
	   		driver.close();
	   		Set<String> allHandle = driver.getWindowHandles();
	   	    for(String wh:allHandle)
	   	    {
	   	     
	   	    }

	}

}
