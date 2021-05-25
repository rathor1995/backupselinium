c

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable6_PrintTable{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/ASR/velocity/selinium/web%20page/webtable.html");
		
		int rowSize = driver.findElements(By.xpath("//table//tbody//tr")).size();
		
		for (int i=1; i<=rowSize; i++)
		{
			int colSize =0;
			if(i==1)
			{colSize= driver.findElements(By.xpath("//table//tbody//tr["+i+"]//th")).size();}
			else
			{colSize= driver.findElements(By.xpath("//table//tbody//tr[\"+i+\"]//td")).size();}
			
			for (int j=1; j<=colSize;j++)
			{
				String text ="";
				if(i==1)
				{text = ((WebElement) driver.findElements(By.xpath("//table//tbody//tr["+i+"]/th["+j+"]"))).getText();}
				else
				{text = ((WebElement) driver.findElements(By.xpath("//table//tbody//tr["+i+"]/td["+j+"]"))).getText();}
				
				System.out.println(text+" ");
			}
			}
		
}
}
