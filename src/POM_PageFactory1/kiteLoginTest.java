package POM_PageFactory1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteLoginTest 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	kiteLoginpage1 login1 = new kiteLoginpage1(driver);
	login1.setkiteLoginpage1UserName();
	login1.setkiteLoginpage1Password();
	login1.clickkiteLoginpage1LoginButton();
	
	kiteLoginPage2 login2 = new kiteLoginPage2(driver);
	login2.setkiteLoginPage2PIN();
	login2.clickkiteLoginPage2();
	
	KiteHomePage home = new KiteHomePage(driver);
	home.verifyKiteHomePageProfileName();
	Thread.sleep(3000);
	driver.close();
	
}
}
