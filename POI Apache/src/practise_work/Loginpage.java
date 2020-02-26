package practise_work;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Ignore;

import Prac_prgrm.parent1;

@Ignore
public class Loginpage {
	
	@FindBy(name="username")
	private WebElement  usernametextfield ;
	@FindBy(name="pwd")
	private WebElement passwordtextfiled;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submittbutton;
	
	
	public Loginpage()
	{
		PageFactory.initElements(parent1.driver,this);
	}
	
	public void usernametextfield(String username) {
		usernametextfield.sendKeys(username);
	}
	
	public void passwordtextfiled(String pwd) {
		
		passwordtextfiled.sendKeys(pwd);
		
	}
	public void submittbutton() {
		submittbutton.click();
	}
	
	
}
