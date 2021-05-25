package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_getcellSize 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");	
	int lasCellNumber= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
	System.out.println(lasCellNumber);
	}
}
