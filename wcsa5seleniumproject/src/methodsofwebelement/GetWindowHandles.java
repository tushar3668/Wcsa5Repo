package methodsofwebelement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
       public static void main(String[] args) {
    	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   		WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   		driver.get("https://omayo.blogspot.com/");
   		// get the handle or address of current or parent window
   		String parenhandle = driver.getWindowHandle();
   		System.out.println(parenhandle);
   		
   		// launch the child window
   		driver.findElement(By.partialLinkText("Open a popup window")).click();
   		// get the handle or address of child window only
   		
   	    Set<String> childHandle = driver.getWindowHandles();
   	    // read the address by using looping statment
   	    for(String wh:childHandle)
   	    {
   	    System.out.println(wh);
   	    }
	}
}
