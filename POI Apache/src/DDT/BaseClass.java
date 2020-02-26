package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static WebDriver driver ;
	String url="http://127.0.0.1:81/login.do";
	     @BeforeTest
	public void OpenBrowser()
	{
		  String browser = "ChromeDriver";
	  if(browser.equals("ChromeDriver"))
		{
			System.setProperty("webdriver.chrome.driver","c://drivers//chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equalIg)
		{
			System.setProperty("webdriver.gecko.driver","c://drivers//geckodriver.exe");
            driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	     
	     @AfterTest
	public void CloseBrowser()
	{
		driver.close();
	}
	     
	@BeforeClass
	public void Login()
	{
		String un ="admin";
		String password = "manager";
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
		
	}
	
	@AfterClass
	public void Logout()
	{
		driver.findElement(By.className("logoutImg")).click();
	}

}
