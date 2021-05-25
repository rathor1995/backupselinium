package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox6_getfirstselectedoption 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select (month);
	s.selectByVisibleText("May");
	
	//System.out.println(s.getFirstSelectedOption().getText());
	
	WebElement selectedOption = s.getFirstSelectedOption();
	String text = selectedOption.getText();
	System.out.println(text);
}
}