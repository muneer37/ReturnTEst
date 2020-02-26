package WorkBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P13_Billing {
	
	
	@FindBy(xpath="//input[@value='Add New Billing Type']")
	  private WebElement AddNewBillingTypeButton ;  // variable decleration 
	
	@FindBy(className="successmsg")
	  private WebElement  getsuccessmessage;
	
	public P13_Billing()
	{
		PageFactory.initElements(P7_Superclass.driver,this);
	}
	
	
	public void AddNewBillingTypeButton()
	{
		AddNewBillingTypeButton.click();	
	}
	
	 public String SucessageMessage()
	 	{
	    	return  getsuccessmessage.getText();
	    	 
	 	}


}
