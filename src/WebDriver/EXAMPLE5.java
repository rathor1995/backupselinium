package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXAMPLE5 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//5) getCurrentUrl
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	
	
	
}
}
