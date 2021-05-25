package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox5 
//is multiple
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe")	;

WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

Thread.sleep(3000);

WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

Select s = new Select (day);
boolean result = s.isMultiple();
System.out.println(result);

if(result==true)
{System.out.println("listbox is of multi-selectable");}
else {System.out.println("list box is of single-selectable");}
}
}
