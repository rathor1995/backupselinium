package Seleinium_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_DDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(" https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		//step1
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"userid\"] ")).sendKeys(UN);
		
		//step2 enter pwd
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath(" //input[@id=\"password\"]")).sendKeys(PWD);
		
		//step3 click on login button
		driver.findElement(By.xpath("//button[text()='Login '] ")).click();
		
		//stp4 enter pin
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath(" //input[@id=\"pin\"]")).sendKeys(PIN);
		
		//step5 click on continue btn
		driver.findElement(By.xpath("//button[@type=\"submit\"] ")).click();
		
		
		String ActUserId = driver.findElement(By.xpath("//span[@class=\"user-id\"]")).getText();
		String expUserId = "DV1510";
		
		if(expUserId.equals(ActUserId))
		{System.out.println("pass");}
		else 
		{System.out.println("Fail");}
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
	}
}
