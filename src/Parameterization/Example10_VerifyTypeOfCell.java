package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example10_VerifyTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
 
	CellType CT = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getCellType();
	
	System.out.println(CT);
	
	}
}
