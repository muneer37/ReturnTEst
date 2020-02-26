package MultipleUsers;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WorkBook.ExcelCustomer;



public class workbook2 {
	  
	@Test
	  public void testexcel2() throws InterruptedException 
		{
		
		String url= workbook1.readData("Sheet1",1,0);
		String un= workbook1.readData("Sheet1",1,1);
		String pwd= workbook1.readData("Sheet1",1,2);
		String cn= workbook1.readData("Sheet1",1,3);
		String exp= workbook1.readData("Sheet1",1,4);
		
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
	String act=	driver.findElement(By.name("")).getText();
	System.out.println(act);
	workbook1.writeData("Sheet2",1,5,act);
	if(exp.equals(act))
	{
		workbook1.writeData("Sheet2",1,6,"pass");
	}
	else
	{
		  workbook1.writeData("Sheet1",1,6,"fail");
	}
		}


}
