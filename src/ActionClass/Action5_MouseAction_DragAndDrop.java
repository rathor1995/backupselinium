package ActionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action5_MouseAction_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

		Actions act = new Actions(driver);
		
		
	act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();	
		
		
		//act.dragAndDrop(source, dest).perform();

		
		
	}
}