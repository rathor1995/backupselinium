package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains2
{
	//1.using attribute
	// tagname [contains(@attributeName,'attribute value')]
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.facebook.com/");
	Thread.sleep (3000);
		

	
}
}
