package WebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");

	//get Position
	Thread.sleep(4000);
  System.out.println(driver.manage().window().getPosition());
}
}