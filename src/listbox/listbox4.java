package listbox;
import java.util.List;

import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox4 
//print month alphabetical order

{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s = new Select (month);
	
	List<WebElement>options = s.getOptions();
	
	TreeSet<String>tr=new TreeSet <String>();
	for(WebElement str:options)
	{
		String text = str.getText();
		tr.add(text);
	}
	for(String s1:tr)
	{System.out.println(s1);}
	
}
}