package PropertyFile;


import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"/file.properties");
		Properties p = new Properties();
		p.load(fis);
		String geturl=p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get(geturl);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Users")).click();		
	}
}
