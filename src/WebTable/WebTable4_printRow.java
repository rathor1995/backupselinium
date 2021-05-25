package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4_printRow 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/ASR/velocity/selinium/web%20page/webtable.html");
		
		List <WebElement> rowElements = driver.findElements(By.xpath("//table//tbody//tr//th"));
		
		for (WebElement element:rowElements)
		{System.out.print(element.getText()+ " ");}
}
}