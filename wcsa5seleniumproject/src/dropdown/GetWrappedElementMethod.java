package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/tusha/Desktop/HTML/MultiSelectDropdown.html");
        
			// identify dropdown
			WebElement dropDownElement = driver.findElement(By.id("v1"));
			Thread.sleep(2000);
			// hndle the dropdown
			Select sel = new Select(dropDownElement);
			
		//	WebElement allOpts = sel.getOptions();
			
		//	for(WebElement op:allOpts)
		//	{
		//		System.out.println(op.getText());
		//	}
           WebElement allOpts = sel.getWrappedElement();
           
           System.out.println(allOpts.getText());
	}

}
