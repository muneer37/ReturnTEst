package WorkBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P10_OpenTaskPage 
{
	@FindBy(linkText="Projects & Customers")
	  private WebElement ProjectAndCustomersLink ;  // variable decleration 
	
	@FindBy(linkText="Settings")
	  private WebElement Setting ;
	
	public P10_OpenTaskPage()
	{
		PageFactory.initElements(P7_Superclass.driver,this);
	}
	
	
	public void clickonProjectAndCustomersLink()
	{
		ProjectAndCustomersLink.click();	
	}
	
	public void clickonSettingButton()
	{
		Setting.click();	
	}

}
