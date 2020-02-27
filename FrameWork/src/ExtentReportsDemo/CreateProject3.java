package ExtentReportsDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class CreateProject3  extends BaseClass45{

	@Test
	public void testCreateProject()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		   driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
	   driver.findElement(By.className("asdfghjnbjhjh ")).click();
	  // driver.close();
	   System.out.println("hii");
	
	}
}
