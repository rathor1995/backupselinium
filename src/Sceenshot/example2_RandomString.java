package Sceenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class example2_RandomString 
{
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");

	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	String random = RandomString.make(2);

	File dest = new File("D:\\ASR\\velocity\\selinium\\abc"+random+".jpg");

	FileHandler.copy(source,dest);
	}
}
