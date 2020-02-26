package Work_Excel;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class worksheet2  extends worksheet1 {
	
	@Test
	  public void testexcel2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
		{
	  
	
	String url= worksheet1.readData("Sheet1",1,9);
	String un= worksheet1.readData("Sheet1",1,10);
	String pwd= worksheet1.readData("Sheet1",1,11);
	
	
	System.setProperty("webdriver.chrome.driver","c://drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Users")).click();
		
		 driver.findElement(By.cssSelector("input[value='Add New User']")).click();
		 driver.findElement(By.xpath("//input[@type='text']"));
		 
		 for(int i=1;i<getRowcount("Sheet1");i++)
		 {
			 for(int j=0;j<getCellcount("Sheet1", 1);j++)
		   {
			 List <WebElement> a1= driver.findElements(By.xpath("//input[@type='text']"));
			 a1.get(j).sendKeys(worksheet1.readData("Sheet1", i,j));
		   }
		   
				//Thread.sleep(1000);
				//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager124");
					driver.findElement(By.name("passwordText")).sendKeys("manager123");
					driver.findElement(By.name("passwordTextRetype")).sendKeys("manager123");
					driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
					driver.findElement(By.cssSelector("input[value='Add New User']")).click();
		 }
		
			driver.findElement(By.className("logoutImg")).click();
			driver.close();
	}
			
				
}
		

