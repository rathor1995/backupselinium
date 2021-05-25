package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2_getColSize1 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///D:/ASR/velocity/selinium/web%20page/webtable.html");
		
		int size = driver.findElements(By.xpath("//table//tbody//tr//td")).size();
		System.out.println(size);
		
		
	}
}

