package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3_MouseAction_RightClick {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2doB4z'] ")).click();
		Thread.sleep(3000);	
		
	WebElement more = driver.findElement(By.xpath("  //div[@class='exehdJ']"));

	Actions act =new Actions(driver);

act.moveToElement(more).perform();

//2//act.moveToElement(more).contextClick().build().perform();
		
//3//act.moveToElement(more).perform();
	//Thread.sleep(2000);
	//act.contextClick().perform();
	
	}

}
