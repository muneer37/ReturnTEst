package Work_Excel;

import java.io.FileInputStream;             
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipledata   //feteching data from excel sheet letters and mumbers
                            // 18/jan class
{

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis = new FileInputStream("c://testdata/user1.xlsx");
		Workbook w1 = WorkbookFactory.create(fis);
		Sheet s1 = w1.getSheet("Sheet1");
		int rowcount =s1.getPhysicalNumberOfRows();    //getlastrowcount()
		System.out.println("rowcount is "+rowcount);
		
		Row r1 = s1.getRow(0);
		
	int cellcount = r1.getPhysicalNumberOfCells();
		System.out.println("cellcount is "+cellcount);
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
			//String s =	s1.getRow(i).getCell(j).getStringCellValue();
			
			Cell cc = s1.getRow(i).getCell(j);
			DataFormatter re = new DataFormatter();
			String s= re.formatCellValue(cc);
				System.out.print(s+"   ");
			}
			System.out.println();
		}
				
	}

}
