package POM_DDF_TestNG_BaseClass_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	
public static String getTD (int rowIndex, int collIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx")	;
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
	
	return value;
}

public static void captureScreenshot(WebDriver driver, int TCID)
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\user\\eclipse-workspace\\DEC2020SELENIUM\\test-output\\ScreenShot"+TCID+".jpg");

	FileHandler.copy(source, dest);
	
}

}	
	
	
	
	
	

