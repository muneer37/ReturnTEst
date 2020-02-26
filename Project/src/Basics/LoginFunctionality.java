package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginFunctionality {

	 WebDriver driver;
	 
	@Test
	public void testlogin() throws InterruptedException
	{
		
		 String d="chrome";
		 
		if(d.equals("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver", "C:drivers/chromedriver.exe");
		     driver = new ChromeDriver();
		     driver.get("http://127.0.0.1:81/login.do");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		     
		     driver.findElement(By.name("username")).sendKeys("admin");
		     driver.findElement(By.name("pwd")).sendKeys("manager");
		   
		     
		     driver.manage().window().setPosition(new Point(0, -1000));
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//input[@type='submit']")).click();
		     
	      }
		else if(d.equals("firefox"))
		  {
			System.setProperty("webdriver.gecko.driver", "C:drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://127.0.0.1:81/login.do");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }

	
		 driver.manage().window().setPosition(new Point(0, -1000));
	}
}