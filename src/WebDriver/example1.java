package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
}
}
