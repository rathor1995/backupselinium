package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(3000);
driver.quit();
}
}
