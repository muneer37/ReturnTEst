package DDT;

import net.sourceforge.htmlunit.corejs.javascript.WrapFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OPenTask {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement ProjectAndCustomer ;
	

	
	
	public OPenTask()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	public void clickonProjectAndCustomerlink()
	{
		ProjectAndCustomer.click();
	}
	
}
