package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
	

}
}