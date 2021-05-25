package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChilBbrowser_Example1
{
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	//1.get
	
	driver.get(" https://skpatro.github.io/demo/links/ ");
	
	Thread.sleep(2000);
	//click on new tab from main page
	driver.findElement(By.xpath("//input[@value='New Tab']")).click();
	
	Set<String> ids = driver.getWindowHandles();  // [11, 22]
	ArrayList<String> al=new ArrayList<String>(ids);    // [11, 22]
	String CWId = al.get(1);
	System.out.println(CWId);
	
	driver.switchTo().window(CWId);
	
	Thread.sleep(15000);
	//click on training
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	
	//switch to main page
	driver.switchTo().window(al.get(0));
	
	
}
}
