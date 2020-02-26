package ExtensReports;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateCustomer extends BaseClass {
	
	
	@Test
	public void testCreateCustomer()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
	   driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	   driver.findElement(By.name("name")).sendKeys("qwerasdfghjdgfdghjkhgv");
	   driver.findElement(By.name("createCustomerSubmit")).click();
	   
	
	}

}

