package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep (3000);
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/classname.html");
	
	
	//enter uN
	driver.findElement(By.className("abc1")).sendKeys("abc");

	driver.findElement(By.className("xyz1")).sendKeys("xyz");

	driver.findElement(By.className("abc1")).sendKeys("99999999");
	
	
}
}

