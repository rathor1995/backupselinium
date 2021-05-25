package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("//input [@id='email']")).sendKeys("abc");;
	
	//1.sendkeys
	    WebElement UN = driver.findElement(By.xpath("//input [@id='email']"));
	    UN.sendKeys("ABC");
	    Thread.sleep(4000);
	
}
}
