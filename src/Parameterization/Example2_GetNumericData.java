package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_GetNumericData 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file =new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");

double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1 ).getNumericCellValue();

System.out.println(data);
}
}
