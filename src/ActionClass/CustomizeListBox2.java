package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizeListBox2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/reg/?rs=7");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	//step1:
	WebElement month = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));	
	//step2:
	Actions act=new Actions(driver);
	
	//step3:
	act.click(month).perform();
	Thread.sleep(2000);
	
	//move to top
	
	for(int i=1; i<=12; i++) {
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
	}
	
	for(int i=1; i<=7; i++) {
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(500);
	}
	
	act.sendKeys(Keys.ENTER).perform();

}
}

