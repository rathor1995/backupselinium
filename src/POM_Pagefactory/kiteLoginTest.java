package POM_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteLoginTest 
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("KiteHomePageKiteHomePage");

kiteLogin1Page login1 = new kiteLogin1Page(driver);
login1.enterUN();
login1.enterPWD();
login1.clickOnLoginButton();

kiteLogin2Page login2 = new kiteLogin2Page(driver);
login2.enterPin();
login2.clickOnCntButton();

kiteHomePage home = new kiteHomePage(driver);
home.verifyPN();
Thread.sleep(3000);
driver.close();
	
	
	
	
	
}
}
