package WorkBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P13_AddNewBillingTypes {
	
	

	@FindBy(name="name0")
	  private WebElement AddTypeNameTextFiled ;  // variable decleration 
	
	@FindBy(xpath="//input[@value='Create Billing Type(s)']")
	  private WebElement  createbillingtypebutton;
	
	public P13_AddNewBillingTypes()
	{
		PageFactory.initElements(P7_Superclass.driver,this);
	}
	
	
	public void AddTypeNameTextFiled(String customername)
	{
		AddTypeNameTextFiled.sendKeys(customername);;	
	}
	
	 public void clickoncreatebillingtypebutton()
	 	{
	    	createbillingtypebutton.click();
	    	 
	 	}


}
