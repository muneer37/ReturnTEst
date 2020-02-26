package DDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
	{
	@FindBy(name="name")
	private WebElement customerNametextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CustomerButton;
	
	@FindBy(name="customerId")
	private WebElement customer;
	
	
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(BaseClass.driver,this);
    }
	public void entercustomerNametextField(String customername)
	{
		customerNametextField.sendKeys(customername);;
	}
	public void clickonCustomerButton ()
	{
		CustomerButton.click();
	}
	
	
	
}
	