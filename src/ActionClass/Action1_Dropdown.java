package ActionClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1_Dropdown 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2doB4z'] ")).click();
Thread.sleep(3000);

//step1
WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N'] "));

//step2
Actions act = new Actions (driver);

//stp3
act.moveToElement(login).perform();
} 
}
