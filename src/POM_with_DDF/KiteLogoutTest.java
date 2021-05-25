package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLogoutTest 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream File = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
	Sheet sh = WorkbookFactory.create(File).getSheet("DDF");
	
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://kite.zerodha.com/");
	
	KiteLogin1Page login1 = new KiteLogin1Page(driver);
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	login1.SetKiteLogin1PageUN(UN);
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	login1.SetKiteLogin1PagePWD(PWD);
	login1.ClickKiteLogin1PageLOGIN();
	
	KiteLogin2Page login2 = new KiteLogin2Page (driver);
	String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	login2.setKiteLogin2PagePIN(PIN);
	login2.clickKiteLogin2PageCntBtn();
	
	
	
	KiteHomePage1 home = new KiteHomePage1(driver);
	String PN = sh.getRow(0).getCell(3).getStringCellValue();
	home.VerifyKiteHomePage1ProfileName(PN);
	
	Thread.sleep(3000);
	
	KiteProfilePage pp = new KiteProfilePage (driver);
	pp.ClickKiteProfilePagePN();
	pp.ClickKiteProfilePageLOGOUT();
	
	
}
}