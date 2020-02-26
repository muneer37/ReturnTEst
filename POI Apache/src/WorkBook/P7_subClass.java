package WorkBook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import practise_work.ExcelCustomer1;

public class P7_subClass  extends P7_Superclass 
{
	@Test
	public void  P7_subClass()
	{
		String cn = ExcelCustomer.readData("Sheet1",3,3);
		String exp = ExcelCustomer.readData("Sheet1",3,4);

		 
   driver.findElement(By.linkText("Projects & Customers")).click();
   driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
   driver.findElement(By.name("name")).sendKeys(cn);
   driver.findElement(By.name("createCustomerSubmit")).click();
 
   String act =    driver.findElement(By.className("successmsg")).getText();
   System.out.println(act);
   ExcelCustomer1.writeData("Sheet1",3,5,act);
      if(exp.equals(act))
      {
    	  ExcelCustomer.writeData("Sheet1",3,6,"pass");
      }
      else
      {
    	  ExcelCustomer.writeData("Sheet1",3,6,"fail");
      }

	}
}
