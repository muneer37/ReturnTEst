package WorkBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class P7_Superclass 
{
	static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		String browser = "chromedriver" ;
		if(browser.equals("chromedriver"))
		{
			System.setProperty("webdriver.chrome.driver", "c://drivers//chromedriver.exe");
		    driver = new ChromeDriver();	
		}
		
		else if(browser.equals("geckodriver"))
		{
			System.setProperty("webdriver.gecko.driver", "c://drivers//geckodriver.exe");
		    driver = new FirefoxDriver();	
		}
		
	}
	@BeforeClass
	public void login()
	{
		 String url = ExcelCustomer.readData("Sheet1",1,0);
    	 String un = ExcelCustomer.readData("Sheet1",1,1);
    	 String pwd = ExcelCustomer.readData("Sheet1",1,2);
    	 String cn = ExcelCustomer.readData("Sheet1",1,3);
    	 String exp = ExcelCustomer.readData("Sheet1",1,4);
    	 
    	
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    		driver.get(url);
    		driver.findElement(By.name("username")).sendKeys(un);
    		driver.findElement(By.name("pwd")).sendKeys(pwd);
    		driver.findElement(By.xpath("//input[@type='submit']")).click();
    		
    		
		
		/*driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();*/
		
	}
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}

}
