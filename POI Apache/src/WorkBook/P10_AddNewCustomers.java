package WorkBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

  public class P10_AddNewCustomers
   {
	  @FindBy(name="name")
	private WebElement CustomerNameTextFiled;
	  
	  @FindBy(name="createCustomerSubmit")
	private WebElement CreateCustomerButton;
	  
	  
	  P10_AddNewCustomers()
	  {
		  PageFactory.initElements(P7_Superclass.driver,this);
	  }
	  
	public void CustomerNameTextFiled(String muneer)  // customer name passing 
	  {
		  CustomerNameTextFiled.sendKeys(muneer);
	  }
	public void clickonCreateCustomerButton()
	  {
		  CreateCustomerButton.click();  
	  }
	
	   

}
