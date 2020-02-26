package WorkBook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import practise_work.ExcelCustomer1;

public class P10_ActTime_Main extends  P7_Superclass
{  
	@Test
	public void testCreateCustomerAccountTc_01() throws InterruptedException
	{
		String testname = ExcelCustomer.readData("Sheet1",2,3);
		String act = ExcelCustomer.readData("Sheet1",2,5);
	
	P10_OpenTaskPage otp = new P10_OpenTaskPage();
	              otp.clickonProjectAndCustomersLink();
	P10_ActiveProjectAndCustomersPage apcp = new P10_ActiveProjectAndCustomersPage();
	                 apcp.clickonAddNewCustomerButton();

    P10_AddNewCustomers adnc = new P10_AddNewCustomers();
	adnc.CustomerNameTextFiled(testname);
	adnc.clickonCreateCustomerButton();
	String exp = apcp.SucessageMessage();
	 //String exp =    driver.findElement(By.className("successmsg")).getText();
          System.out.println(exp);
       ExcelCustomer1.writeData("Sheet1",2,5,exp);
        if(act.equals(exp))
        {
      	  ExcelCustomer1.writeData("Sheet1",2,6,"pass");
        }
        else
        {
      	  ExcelCustomer1.writeData("Sheet1",2,6,"fail");
        }
	    
	     /*  P10_OpenTaskPage otp = new P10_OpenTaskPage();
	                    otp.clickonSettingButton();
	     P13_Billing b = new P13_Billing();
	     b.AddNewBillingTypeButton();
	     P13_AddNewBillingTypes anbt = new P13_AddNewBillingTypes();  
	     Thread.sleep(3000);
	      anbt.AddTypeNameTextFiled("yours love ");
	      anbt.clickoncreatebillingtypebutton();
	    String str=  b.SucessageMessage();
	      System.out.println(str);*/

	}

}
