package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_get_Boolean_Value 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
	boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	System.out.println(data);
			
}
}
