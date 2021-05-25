package HandlingOfDynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getReviewsFromFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);

		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input [@type = 'text']")).sendKeys("redmi note 9 pro");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(3000);

		String ratings = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]")).getText();

		System.out.println(ratings);
}
}