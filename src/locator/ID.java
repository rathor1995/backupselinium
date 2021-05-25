package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep (3000);
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/id.html");
	Thread.sleep (3000);
	
	//enter uN
	driver.findElement(By.id("1234")).sendKeys("abc");
	Thread.sleep (3000);
	
	//enter pwd
	driver.findElement(By.id("567")).sendKeys("xyz");
	Thread.sleep (3000);
	
	//enter contact
		driver.findElement(By.id("123456")).sendKeys("8654545");
		Thread.sleep (3000);
	
	
	
}
}

