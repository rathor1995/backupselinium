package WebDriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");	
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//8. setSize
	
	Dimension d = new Dimension (200,400);
	driver.manage().window().setSize(d);
	
	

}
}