package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_selectMultipleCheckboxes 

{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/checkbox.html");
		
	
	

	List <WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println("Totalno of checkboxes: "+AllCheckboxes.size());
	
	for (WebElement checkbox: AllCheckboxes)
	{checkbox.click();
	Thread.sleep(5000);
	}
		
	
	
	
	
}
}
