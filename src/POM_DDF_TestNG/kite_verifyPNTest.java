package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_with_DDF.KiteLogin1Page;
import POM_with_DDF.KiteLogin2Page;
import POM_with_DDF.KiteProfilePage;

public class kite_verifyPNTest 
{
	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	KiteProfilePage profile;
	
	Sheet sh;
	WebDriver driver;
	
@BeforeClass
public void openBrowser() throws EncryptedDocumentException, IOException
{
FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx")	;
sh = WorkbookFactory.create(file).getSheet("DDF");
	
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe")	;
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("https://kite.zerodha.com/");

login1 = new KiteLogin1Page(driver);
login2 = new KiteLogin2Page(driver);
home = new KiteHomePage(driver);
profile = new KiteProfilePage(driver);

}

@BeforeMethod
 public void loginToApp()
 {
	login1.SetKiteLogin1PageUN(sh.getRow(0).getCell(0).getStringCellValue()); 
	login1.SetKiteLogin1PagePWD(sh.getRow(0).getCell(1).getStringCellValue());
	login1.ClickKiteLogin1PageLOGIN();
	login2.setKiteLogin2PagePIN(sh.getRow(0).getCell(2).getStringCellValue());
	login2.clickKiteLogin2PageCntBtn();
 }


@Test
 public void veifyPN()
 {
	String actPN = home.getKiteHomePage(driver);
	String expPn = sh.getRow(0).getCell(3).getStringCellValue();
	System.out.println("actPN"+actPN);
	System.out.println("expPN"+expPn);
	
	Assert.assertEquals(actPN, expPn,"Act&exp result are diffrent");
	
	
 }

@AfterMethod
public void logoutFromapp()
{
	home.clickKiteHomePagePn();
	profile.ClickKiteProfilePageLOGOUT();
	
}

@AfterClass
public void CloseBrowser() throws InterruptedException
{
Thread.sleep(6000);
driver.close();

	}
}
