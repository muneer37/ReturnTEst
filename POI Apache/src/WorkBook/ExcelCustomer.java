package WorkBook;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCustomer
{
public static String readData(String sheetName,int rowNum,int cellNum)
 {
	 try
	 {
		 FileInputStream fis=new FileInputStream("c://testdata//userdata1.xlsx"); //locatoim
		//String s=w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).getStringCellValue();    SHORTER VERSION
		Workbook w1=WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet(sheetName);
		Row r1=s1.getRow(rowNum);
		Cell c1=r1.getCell(cellNum);
		String s=c1.getStringCellValue();
		return s;
	 }
     catch(Exception e)
	 { 
    	 return " ";  // return type is string 
	 }
 }
  public static void writeData(String sheetName,int rowNum,int cellNum,String data)
	 {
		 try
		 {
			 FileInputStream fis=new FileInputStream("c://testdata//userdata1.xslx");
			Workbook w1=WorkbookFactory.create(fis);
			//w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);     SHORTER VERSION
			Sheet s1=w1.getSheet(sheetName);
			Row r1=s1.getRow(rowNum);
			Cell c1=r1.createCell(cellNum);
			c1.setCellValue(data);
			FileOutputStream fos=new FileOutputStream("c://testdata//userdata1.xlsx");
			w1.write(fos);
		 }
		 catch(Exception e)
		 {
			 
          }
     }	 
}