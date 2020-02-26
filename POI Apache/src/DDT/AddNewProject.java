package DDT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProject {
	
	@FindBy(name="customerId")
	private WebElement SelectByCustomer;
	
	
	@FindBy(name="name")
	private WebElement  ProjectName;
	
	@FindBy(name="createProjectSubmit")
	private WebElement  ProjectNameButton;
	
	public AddNewProject()
	{
		PageFactory.initElements(BaseClass.driver,this);

	}
	
	public void SelectByCustomer()
	{
		Select s = new Select(SelectByCustomer);
		s.selectByVisibleText("lovely munna");
	}
	public void enterProjectName(String projectname)
	{
		ProjectName.sendKeys(projectname);
	}
	
	public void clickProjectNameButton()
	{
		ProjectNameButton.click();
	}
	
	

}
