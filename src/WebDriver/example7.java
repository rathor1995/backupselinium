package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// 7) navigate
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep (3000);
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep (3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
}
}
