package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Testexecution1 
{
	
	@Test
	public void Functionaltesting()
	{
		System.setProperty("webdriver.chrome.driver", "c://drivers//chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("http://127.0.0.1:81/login.jsp");
		cd.findElement(By.name("username")).sendKeys("admin");
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.xpath("//input[@type='submit']")).click();
		
		cd.findElement(By.linkText("Projects & Customers")).click();
   cd.findElement(By.name("customersToArchive[5]")).click();
   cd.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
 
     cd.switchTo().alert().dismiss();
     cd.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
   
     String s= cd.switchTo().alert().getText();
     System.out.println(s);
     cd.switchTo().alert().accept();
    String a=cd.findElement(By.className("sucessmsg")).getText();
    System.out.println(a);
		
		cd.close();
	}

	
	

}
