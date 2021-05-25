package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getRowSize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file = new FileInputStream("D:\\ASR\\velocity\\dec20.xlsx");	
int lasRowNumber= WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
System.out.println(lasRowNumber);
}
}
