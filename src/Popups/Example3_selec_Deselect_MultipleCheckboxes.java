package Popups;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_selec_Deselect_MultipleCheckboxes {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/checkbox.html");

		List <WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("Totalno of checkboxes: "+AllCheckboxes.size());
		
		for(int i=0 ;i<=AllCheckboxes.size()-1;i++)
		{AllCheckboxes.get(i).click();
		Thread.sleep(1000);}
		
		for(int i =AllCheckboxes.size()-1;i>=0;i--)
		{AllCheckboxes.get(i).click();
		Thread.sleep(1000);}
}
}

