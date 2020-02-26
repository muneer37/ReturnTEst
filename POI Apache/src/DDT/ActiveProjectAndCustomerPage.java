package DDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class ActiveProjectAndCustomerPage {
	
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement AddNewCustomerButton;
	
	@FindBy(className="successmsg")
	private WebElement SucessMessage;
	
	@FindBy(xpath="//input[@onclick='addCustomer(this.form)']")
	private WebElement AddNewProjectButton;
	
	public ActiveProjectAndCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
    }
     public void clickonAddNewCustomerButton()
	{
    	 AddNewCustomerButton.click();
	}
	
	public String getSucessMessage()
	{
		return SucessMessage.getText();
	}
	
	public void clickonAddNewProjectButton()
	{
		AddNewProjectButton.click();
	}

	
	

}
