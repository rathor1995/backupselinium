package Autosugestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugestion1_printallOption 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

Thread.sleep(3000);

driver.findElement(By.xpath(" //input[@class='gLFyf gsfi']")).sendKeys("oneplus");

Thread.sleep(3000);
 List<WebElement>AllOption =  driver.findElements(By.xpath("//ul[@class='erkvQe']/li "));
 for(WebElement option:AllOption)	 
 {System.out.println(option.getText());}
	
	
}
}
