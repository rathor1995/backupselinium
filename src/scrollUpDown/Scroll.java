package scrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://www.guru99.com/https://www.guru99.com/");

	driver.manage().window().maximize();

	Thread.sleep(3000);

	//Down--> 2nd parameter +ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	
	//up--> 2nd parameter -ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
	Thread.sleep(3000);
	
	    //right--> 1st parameter +ve value
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//	Thread.sleep(3000);
	
	     //right--> 1st parameter +ve value
	//	((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
	//	Thread.sleep(3000);
	
	}
}
