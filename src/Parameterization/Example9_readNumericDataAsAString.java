package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_readNumericDataAsAString 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	String data = sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
	}
}
