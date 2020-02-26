package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LoginPage {
	
	@Test
	public void testLogin()
	{
		
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			
			
		}
		
		
		
	}
	
}
 