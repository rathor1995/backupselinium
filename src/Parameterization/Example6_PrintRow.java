package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_PrintRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");	
	Sheet sh= WorkbookFactory.create(file).getSheet("Sheet2");
	for(int i=0; i<=sh.getRow(0).getLastCellNum()-1;i++)
	{
		String data = sh.getRow(0).getCell(i).getStringCellValue();
		
		System.out.println(data);
	}
	}
}
