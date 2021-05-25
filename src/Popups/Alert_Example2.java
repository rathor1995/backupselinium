package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example2
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//1.get
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	driver.findElement(By.xpath("(//button[text()='Click me!']) [1 ]")).click();
	
	Thread.sleep(3000);
	
	//String text = driver.switchTo().alert().getText() ;
	//System.out.println(text);
	
	//driver.switchTo().alert().accept();
	
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	
}
}
