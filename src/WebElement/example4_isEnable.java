package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_isEnable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	//boolean result= loginButton.isEnabled();
	//System.out.println(result);
	
	//if(result==true)
	//{System.out.println("element is enable");}
	//else
	//{System.out.println("element is disable");}
	
		if(loginButton.isEnabled())
		{System.out.println("element is enable");}
		else
		{System.out.println("element is disable");}
	
	
}
	}
