package practise_work;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCustomer1
{
	public static String readData(String sheetName,int rowNumber, int cellNumber)
	{     
		try{
			
			FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
	
		String s=	wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	       
	       return s;
		}
		catch(Exception e)
		{
			return " ";
		}
		
	}
	
	public static void writeData(String sheetName,int rowNumber, int cellNumber,String data)
	{
		
		try{
			FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");
			
			Workbook w = WorkbookFactory.create(fis);
			w.getSheet(sheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(data);
			   
		FileOutputStream fos = new FileOutputStream("c://testdata//userdata1.xlsx");	
		             
		              w.write(fos);
		             System.out.println("Data Excecution sucessfully   ");
		
		     }
		catch(Exception e)
		{
		
		}
	}

}
