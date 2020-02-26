package MultipleUsers;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class workbook1 {
	  
	
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
