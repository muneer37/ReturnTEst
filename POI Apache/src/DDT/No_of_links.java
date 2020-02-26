package DDT;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","c://drivers/chromedriver.exe");
           
		ChromeDriver cd = new ChromeDriver();
		/*cd.get("https://www.google.com/");
		cd.manage().window().maximize();
		List <WebElement> al=cd.findElements(By.tagName("a"));
		System.out.println("all links="+al.size());
		System.out.println(al);*/
		cd.get("http://127.0.0.1:81/login.jsp");
		cd.findElement(By.name("username")).sendKeys("admin");
		cd.findElement(By.name("pwd")).sendKeys("manager");
		cd.findElement(By.xpath("//input[@type='submit']")).click();
		List <WebElement> al=cd.findElements(By.tagName("a"));
		System.out.println("all links="+al.size());
		System.out.println(al);
		cd.findElement(By.linkText("My Account")).click();
		cd.findElement(By.name("passwordCur")).sendKeys("raj");
		cd.findElement(By.linkText("Projects & Tasks")).click();
		String s =cd.findElement(By.id("DiscardChangesButton")).getText();
		System.out.println(s);
		cd.findElement(By.id("DiscardChangesButton")).click();
		cd.close();
	}

}
