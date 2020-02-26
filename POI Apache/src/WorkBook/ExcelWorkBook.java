package WorkBook;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelWorkBook {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("c://testdata//userdata1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
	String s=	wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
       System.out.println(s);
	}

}
