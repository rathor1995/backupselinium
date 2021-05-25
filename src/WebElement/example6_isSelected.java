package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_isSelected
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();;
			Thread.sleep(3000);
			WebElement female = driver.findElement(By.xpath("//input[@type='radio']"));
			female.click();
			
			if (female.isSelected())
			{System.out.println("radio button already selected");}
			else
			{System.out.println("radio button not selected");}
	}
}