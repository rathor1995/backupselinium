package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_click 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	
	WebElement link = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
	link.click();
}
}
