package DDT;

import org.testng.annotations.Test;

public class CreateCustomerTc_01 extends  BaseClass
{
	@Test
    public void testCreateCustomerTc_01() throws InterruptedException
   {
          OPenTask otp = new OPenTask();
       otp.clickonProjectAndCustomerlink();
       
       ActiveProjectAndCustomerPage apcp = new ActiveProjectAndCustomerPage();
    //   Thread.sleep(1000);
       //apcp.clickonAddNewCustomerButton();
       apcp.clickonAddNewProjectButton();
       
       
     AddNewProject anp = new AddNewProject();
         anp.SelectByCustomer();
          anp.clickProjectNameButton();
          anp.enterProjectName("GK Lovely Project");
       
     /* AddNewCustomerPage ncp = new AddNewCustomerPage();
       ncp.entercustomerNametextField("fat Munna");
       ncp.clickonCustomerButton();
       String s= apcp.getSucessMessage();
       System.out.println(s);*/


	}

	
}
