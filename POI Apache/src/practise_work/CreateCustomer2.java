package practise_work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer2 {
	    
	    

		@Test
	       public void testCreateCustomer()
      	{
	    	 String url = ExcelCustomer1.readData("Sheet1",1,0);
	    	 String un = ExcelCustomer1.readData("Sheet1",1,1);
	    	 String pwd = ExcelCustomer1.readData("Sheet1",1,2);
	    	 String cn = ExcelCustomer1.readData("Sheet1",1,3);
	    	 String exp = ExcelCustomer1.readData("Sheet1",1,4);
	    	 
	    		//System.setProperty("webdriver.chrome.driver", "c://drivers//chromedriver.exe");
	    		System.setProperty("webdriver.gecko.driver", "c://drivers//geckodriver.exe");
			    WebDriver cd = new FirefoxDriver();	
			
	    		//ChromeDriver cd = new ChromeDriver();
	    		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    		//cd.get("http://127.0.0.1:81/login.do");
	    		cd.get(url);
	    	    cd.findElement(By.name("username")).sendKeys(un);
	    		cd.findElement(By.name("pwd")).sendKeys(pwd);
	    		cd.findElement(By.xpath("//input[@type='submit']")).click();
	    		
	    		cd.findElement(By.linkText("Projects & Customers")).click();
	    		cd.findElement(By.xpath("//input[@value='Add New Customer']")).click();
                cd.findElement(By.name("name")).sendKeys(cn);
                cd.findElement(By.name("createCustomerSubmit")).click();
        
           String act =    cd.findElement(By.className("successmsg")).getText();
           System.out.println(act);
           ExcelCustomer1.writeData("Sheet1",1,5,act);
              if(exp.equals(act))
              {
            	  ExcelCustomer1.writeData("Sheet1",1,6,"pass");
              }
              else
              {
            	  ExcelCustomer1.writeData("Sheet1",1,6,"fail");
              }
	  
		
	    }

		 
}
