package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.in/");
Thread.sleep(3000);


String actResult = driver.getTitle();
System.out.println(actResult);

String expResult = "Google";
if(actResult.equals(expResult))
{System.out.println("pass");}
else
{System.out.println("fail");}
}
}
