package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		;
//	boolean result= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	//System.out.println(result);

	//WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//boolean result=logo.isDisplayed();
	//System.out.println(result);
	
		
		boolean result;
		try
		{
			WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		result = logo.isDisplayed();
		}
		catch (NoSuchElementException e) {result=false;}
		System.out.println(result);
}
	}
