package ExtentReportsDemo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateCustomer3 extends BaseClass45 {
	
	
	@Test
	public void testCreateCustomer()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
	   driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	   driver.findElement(By.name("name")).sendKeys("dgfdghjkhgv");
	   driver.findElement(By.name("createCustomerSubmit")).click();
	   
	
	}

}
