package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep (3000);
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/linktext.html");
	
	Thread.sleep(3000);
driver.findElement(By.linkText("facebook")).click();;
	
	
}
}

