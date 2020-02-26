package GroupExcecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestScript {
	
	public static WebDriver driver;
	
	  @BeforeTest
	public void openbrowser()
	{
	 String str= "chromedriver" ;
	
		  if(str.equalsIgnoreCase("chromedriver"))
		  {
			  System.setProperty("webdriver.chrome.driver", "c://drivers/chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get("http://127.0.0.1:81/login.do");
			  
		  }
		  
	  else {
		  
	      System.setProperty("wedbdriver.gecko.driver","c://drivers/geckodriver.exe");
	
	      driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("http://127.0.0.1:81/login.do");
	  }
	}

}
