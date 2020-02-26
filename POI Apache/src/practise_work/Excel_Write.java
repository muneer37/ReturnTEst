package practise_work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;

public class Excel_Write {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");
		
		Workbook w = WorkbookFactory.create(fis);
		//Sheet s  =      w.getSheet("Sheet1");
		//Row r = s.createRow(3);
		//Cell c = r.createCell(4);
		  // c.setCellValue("Hyderabad ");   
		
		   //  shot cut below method
		
		   w.getSheet("Sheet1").createRow(3).createCell(4).setCellValue("Hyderabad ");
		   
	FileOutputStream fos = new FileOutputStream("c://testdata//userdata1.xlsx");	
	             
	              w.write(fos);
	             System.out.println("Data Excecution sucessfully   ");
	
	
	
	
		   

	}

}
