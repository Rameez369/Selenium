package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genericexcel {
	public static String getdata(String Sheet,int row,int column) throws EncryptedDocumentException, IOException{
	String value="";
		FileInputStream fis=new FileInputStream("./excel/hybrid.xlsx");
	Workbook book =WorkbookFactory.create(fis);
	Cell c=book.getSheet(Sheet).getRow(row).getCell(column);
	return value=c.getStringCellValue();
	}

}