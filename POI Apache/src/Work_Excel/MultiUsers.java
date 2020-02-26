package Work_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultiUsers {
	
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
	
	public static String readData(String sheetName,int rowNum,int cellNum)  
	{ 
	
		 try
		 {
			 FileInputStream fis=new FileInputStream("c://testdata//userdata1.xlsx"); //locatoim
			 Workbook w1 = WorkbookFactory.create(fis);
			 String sheet= w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			return sheet;
		 }
	     catch(Exception e)
		 { 
	    	 return " ";
		 }
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



