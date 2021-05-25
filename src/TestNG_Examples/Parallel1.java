package TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 
{
@Test
public void TC1() throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
Thread.sleep(6000);
driver.close();
	
}
}
