package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1_getRowSize 
{
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/webtable.html");
	
	List <WebElement> AllRows = driver.findElements(By.xpath("//table//tbody//tr"));
	System.out.println(AllRows.size());
	
	//System.out.println(driver.findElements(By.xpath("//table//tbody//tr")).size());
	
	
	
}	
}