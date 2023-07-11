package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("file:///C:/Users/tusha/Desktop/HTML/MultiSelectDropdown.html");
           
			// identify dropdown
			WebElement dropDownElement = driver.findElement(By.id("v1"));
			
			// hndle the dropdown
			Select sel = new Select(dropDownElement);
			
			// select multiple options from dropdown
			for(int i=0;i<=4;i++)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
				
			}
			// to read all selected options from dropdown
			List<WebElement> allOpts = sel.getAllSelectedOptions();
			// to read all yhe options we use loop...
	//		for(WebElement op:allOpts)
	//		{
	//			op.getText();
	//		}
			//using for loop
			for(int i=0;i<allOpts.size();i++)
			{
				Thread.sleep(2000);
				System.out.println( allOpts.get(i).getText());
				
			}
	}

}
