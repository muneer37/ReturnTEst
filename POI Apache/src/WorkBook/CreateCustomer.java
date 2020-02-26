package WorkBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import practise_work.ExcelCustomer1;



public class CreateCustomer 
{
	@Test
	public void testcreatecustomer() throws InterruptedException
	{
		
		String url= ExcelCustomer.readData("Sheet1",1,0);
		String un= ExcelCustomer.readData("Sheet1",1,1);
		String pwd= ExcelCustomer.readData("Sheet1",1,2);
		String cn= ExcelCustomer.readData("Sheet1",1,3);
		String exp= ExcelCustomer.readData("Sheet1",1,4);
		System.setProperty("webdriver.chrome.driver","c://drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys(cn);
		driver.findElement(By.name("createCustomerSubmit")).click();
		 String act =    driver.findElement(By.className("successmsg")).getText();
         System.out.println(act);
         ExcelCustomer.writeData("Sheet1",1,5,act);
            if(exp.equals(act))
            {
          	  ExcelCustomer.writeData("Sheet1",1,6,"pass");
            }
            else
            {
          	  ExcelCustomer.writeData("Sheet1",1,6,"fail");
            }
	  
	}
}