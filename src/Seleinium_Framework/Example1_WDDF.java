package Seleinium_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WDDF
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get(" https://kite.zerodha.com/");
	driver.manage().window().maximize();
	
	//step1
	driver.findElement(By.xpath("//input[@id=\"userid\"] ")).sendKeys("DV1510");
	
	//step2 enter pwd
	driver.findElement(By.xpath(" //input[@id=\"password\"]")).sendKeys("Vijay@123");
	
	//step3 click on login button
	driver.findElement(By.xpath("//button[text()='Login '] ")).click();
	
	//stp4 enter pin
	driver.findElement(By.xpath(" //input[@id=\"pin\"]")).sendKeys("959594");
	
	//step5 click on continue btn
	driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
	
	
	String ActUserId = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
	String expUserId = "DV1510";
	
	if(expUserId.equals(ActUserId))
	{System.out.println("pass");}
	else 
	{System.out.println("Fail");}
	
	Thread.sleep(3000);
	
	driver.close();
	
	
	
	
}
}
