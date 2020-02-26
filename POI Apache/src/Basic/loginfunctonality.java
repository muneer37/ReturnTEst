package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginfunctonality {
	
	public static WebDriver driver;
	 String url="http://127.0.0.1:81/login.do";
	@Test
	public void testlogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:drivers/chromedriver.exe");
		 String d="chrome";
		 
		if(d.equals("chrome"))
		  {
		     driver = new ChromeDriver();
		     driver.get(url);
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      }
		else if(d.equals("firefox"))
		  {
			driver = new FirefoxDriver();
			driver.get(url);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
		
	}

}
