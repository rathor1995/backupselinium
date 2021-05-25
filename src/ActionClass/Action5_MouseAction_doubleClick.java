package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5_MouseAction_doubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://demo.guru99.com/test/simple_context_menu.html ");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).doubleClick().build().perform();
		Thread.sleep(5000);
		act.doubleClick(ele).perform();
	}
	
}
