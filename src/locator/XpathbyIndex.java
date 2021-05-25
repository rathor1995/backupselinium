package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyIndex 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep (3000);
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/xpathindex.html");
	Thread.sleep (3000);
	
	//enter fN
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");
	Thread.sleep (3000);
	
	//enter LN
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
	Thread.sleep (3000);
	
	//enter email
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@123");
	Thread.sleep (3000);
	
	//enter mobile
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
	
	
	
}
}
