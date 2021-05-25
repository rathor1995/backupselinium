package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");	
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	// 6) maximize
	driver.manage().window().maximize();
	
	
}
}
