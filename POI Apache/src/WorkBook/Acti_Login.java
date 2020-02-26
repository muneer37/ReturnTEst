package WorkBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://drivers/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://127.0.0.1:81/login.jsp");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
cd.findElement( By.name("username")).sendKeys("admin");
		
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.xpath("//input[@type='submit']")).click();
		  
		cd.findElement(By.linkText("Reports")).click();
		
		cd.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		cd.findElement(By.linkText("Users")).click();

	}

}
