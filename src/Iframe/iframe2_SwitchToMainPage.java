package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2_SwitchToMainPage 
{

public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
    
	Thread.sleep(3000);

	//WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	
	driver.switchTo().frame("iframeResult");
	//driver.switchTo().parentFrame();
	
	driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	driver.switchTo().defaultContent();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	 
}	
	
}
