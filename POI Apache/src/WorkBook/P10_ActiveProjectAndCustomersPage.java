package WorkBook;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_ActiveProjectAndCustomersPage 
{
	@FindBy(xpath="//input[@value='Add New Customer']")
 private WebElement AddNewCustomerButton;
	
	
	@FindBy(className="successmsg")
  private WebElement SucessageMessage;
	
   public P10_ActiveProjectAndCustomersPage()
	{
		PageFactory.initElements(P7_Superclass.driver,this);
	}
	
   public void clickonAddNewCustomerButton()
	{
    	 AddNewCustomerButton.click();
	}
     
  public String SucessageMessage()
 	{
    	return  SucessageMessage.getText();
    	 
 	}
     
     

}
