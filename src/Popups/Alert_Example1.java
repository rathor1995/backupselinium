package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example1
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//1.get
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	driver.findElement(By.xpath("(//button[text()='Click me!']) [1 ]")).click();
	
	Thread.sleep(3000);
	
	//Alert alt = driver.switchTo().alert();
	//alt.accept();
	
	driver.switchTo().alert().accept();
}
}
