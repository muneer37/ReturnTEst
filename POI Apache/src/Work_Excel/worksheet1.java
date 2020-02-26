package Work_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class worksheet1 {
	
	public static int getRowcount(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");//(System.getProperty("user.dir")+"//testexcel//userdata1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	
	public static int getCellcount(String sheetName, int rollNumber) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");//(System.getProperty("user.dir")+"//testexcel//userdata1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		return w1.getSheet(sheetName).getRow(rollNumber).getPhysicalNumberOfCells();
	}
	
	public static String readData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, InvalidFormatException, IOException  
	{ 
	
		 
	
			 FileInputStream fis=new FileInputStream("c://testdata//userdata1.xlsx"); //locatoim
			 Workbook w1 = WorkbookFactory.create(fis);
			 Cell sheet= w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
			 DataFormatter df = new DataFormatter();
			 String s=  df.formatCellValue(sheet);
			return s;
		 
	 
	}
	public static void writeData(String Sheet,int row,int cell,String data) 
	{
		try{
			FileInputStream fis = new FileInputStream ("c://testdata//userdata1.xlsx");
			
				Workbook wb = WorkbookFactory.create(fis);
				      wb.getSheet(Sheet).getRow(row).getCell(cell).setCellValue("data");
				      
			FileOutputStream fos = new FileOutputStream("c://testdata//userdata1.xlsx");
			       wb.write(fos);
			}
			catch(Exception e)
			{
				
			}
		
		
		
	}

}
