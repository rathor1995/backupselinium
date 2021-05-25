package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example11_PrintDataUsingCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");
	
	Cell CellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0);
	
	CellType CT = CellInfo.getCellType();
	
	if (CT==CellType.STRING)
	{System.out.println(CellInfo.getStringCellValue());}
	
	else if (CT== CellType.NUMERIC)
	{System.out.println(CellInfo.getNumericCellValue());}
	
	else if (CT== CellType.BOOLEAN)
	{System.out.println(CellInfo.getBooleanCellValue());}
}

	
	
}