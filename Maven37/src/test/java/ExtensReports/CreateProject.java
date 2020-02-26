package ExtensReports;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateProject extends BaseClass {
	

	@Test
	public void testCreateProject()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		   driver.findElement(By.xpath("//input[@value='Add New Project']")).click();
	   driver.findElement(By.className("asddfgdfghjkasdfghjnbjhjh ")).click();
	  // driver.close();
	
	}

}
