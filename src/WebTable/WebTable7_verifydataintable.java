package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable7_verifydataintable {
public static void main(String[] args) {
	
String exp="300";
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/ASR/velocity/selinium/web%20page/webtable.html");
	
	int rowSize = driver.findElements(By.xpath("//table//tbody//tr")).size();
		
	for(int i=2; i<=rowSize; i++) {
		int colSize = driver.findElements(By.xpath("//table//tbody//tr["+i+"]/td")).size();
		for(int j=1; j<=colSize; j++) {
			String act="";
			if(i==1) 
			{
				act = driver.findElement(By.xpath("//table//tbody//tr["+i+"]/th["+j+"]")).getText();
				if(exp.equals(act)) {
					System.out.println("300 text found at index "+i+","+j);
				}
			}
			else
			{
				act = driver.findElement(By.xpath("//table//tbody//tr["+i+"]/td["+j+"]")).getText();
				if(exp.equals(act)) {
					System.out.println("300 text found at index "+i+","+j);
				}
			}
			
			
		}
		System.out.println();		
	}
	
}
}