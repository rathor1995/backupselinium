package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContain1 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	Thread.sleep (3000);
		
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	
}
}
