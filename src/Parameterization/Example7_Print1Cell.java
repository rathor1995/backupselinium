package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example7_Print1Cell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	int lastRowIndex = sh.getLastRowNum();
	
	for (int i=0;i<=lastRowIndex; i++)
	{
	String data = sh.getRow(i).getCell(2).getStringCellValue();
	
	System.out.println(data);
	}
	}
}
