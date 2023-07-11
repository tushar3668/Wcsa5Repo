package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
  public static void main(String[] args) throws InterruptedException {
	  // Single Select DropDown
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/tusha/Desktop/HTML/SingleSelectDropdown.html");
	 // identify dropdown on webpage
        WebElement dropDownElement = driver.findElement(By.id("menu"));
     
     // handle the dropdown by creating obj of select
        Select sel = new Select(dropDownElement);
      
     // read all the option from dropdown
        List<WebElement> allOps = sel.getOptions();
       
     // To read List use lopping statement
        for(WebElement op:allOps)
        {
    	  if(op.getText().equals("pav bhaji"))
    	{
    		  Thread.sleep(2000);
    		  op.click();
    		  break;
        }
    	  
      }
      
   }
}
