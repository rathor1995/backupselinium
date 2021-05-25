package scrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_intoview 
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
driver.get("http //demo.guru99.com/test/guru99home/");

driver.manage().window().maximize();

Thread.sleep(3000);

WebElement ele = driver.findElement(By.linkText("Linux"));

Thread.sleep(3000);

((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);
}
}
