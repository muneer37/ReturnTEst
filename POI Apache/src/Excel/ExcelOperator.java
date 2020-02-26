package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ExcelOperator {
	
	public static int getRowcount(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	
	public static int getCellcount(String sheetName, int rollNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getRow(rollNumber).getPhysicalNumberOfCells();
	}
	
	public static String readdata(String sheetName,int rollNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Cell cc = w1.getSheet(sheetName).getRow(rollNumber).getCell(cellNumber);
		DataFormatter re = new DataFormatter();
		String s= re.formatCellValue(cc);
		return s;
	
	
	}
	public static String writedta(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//testdata//userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Cell c = w1.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber); //.getPhysicalNumberOfRows();
	}

	
}
