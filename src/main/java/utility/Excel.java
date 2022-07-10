package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String getData(String sheetName, int row, int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\PROGRAM\\JAVA\\Groww\\src\\test\\resources\\groww.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		//System.out.println(value);
		return value;
	}
}
