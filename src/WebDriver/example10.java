package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");

//setSize
Thread.sleep(4000);
Dimension d = new Dimension (0,0);
driver.manage().window().setSize(d);

//setPosition
Thread.sleep(4000);
Point p = new Point (400,800);
driver.manage().window().setPosition(p);
}
}
