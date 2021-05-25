package TestNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting_CompatibilityTesting 
{
	
@Parameters("browserName")
@Test

public void TC1(String browserName) throws InterruptedException
{
	WebDriver driver = null;
	
if(browserName.equals("chrome"))	
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");	
 driver = new ChromeDriver();
 }

else if(browserName.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");	
	 driver = new FirefoxDriver();	
}

else if(browserName.equals("ie"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\AppData\\Roaming\\Microsoft\\Internet Explorer\\Quick Launch\\User Pinned\\TaskBar\\Internet Explorer.lnk");	
	 driver = new InternetExplorerDriver();	
}

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(6000);
driver.close();
}
}