package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
//9.getSize
System.out.println(driver.manage().window().getSize());


driver.manage().window().maximize();
//9.getSize
System.out.println(driver.manage().window().getSize());
}
}