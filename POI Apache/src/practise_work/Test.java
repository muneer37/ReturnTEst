package practise_work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver","c://drivers/chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver","c://drivers//geckodriver.exe");
	//WebElement driver = new FirefoxDriver();
	ChromeDriver driver=new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

   
      driver.get("http://tutorialsninja.com/demo ");
         //  driver.get("http://tutorialsninja.com/demo/index.php?route=product/category&path=20_27");

      
      driver.findElement(By.linkText("My Account")).click();
      driver.findElement(By.linkText("Register")).click();
      
      driver.findElement(By.linkText("Components")).click();
      driver.findElement(By.name("firstname")).sendKeys("Muneer Basha");
      driver.findElement(By.name("lastname")).sendKeys("Shaik");
      driver.findElement(By.name("email")).sendKeys("ahammadlve@gmail.com");
      driver.findElement(By.name("telephone")).sendKeys("9705661213");
      driver.findElement(By.name("password")).sendKeys("una37");
      driver.findElement(By.name("confirm")).sendKeys("una37");
      driver.findElement(By.name("agree")).click();
      driver.findElement(By.xpath("//input[@value='Continue']")).click();
      Thread.sleep(3000);
      driver.findElement(By.linkText("Continue")).click();
      
    WebElement w=  driver.findElement(By.linkText("Desktops"));
     Actions a = new Actions(driver);
     a.moveToElement(w).perform();
   
      driver.findElement(By.linkText("Mac (1)")).click();
    Thread.sleep(3000);
      driver.findElement(By.xpath("//img[@alt='iMac']")).click();
     
      driver.findElement(By.id("button-cart")).click();
     // Thread.sleep(3000);
      driver.findElement(By.id("cart")).click();
     // driver .findElement(By.xpath("//strong[text()='Checkout')")).click();
     driver.findElement(By.xpath("//*[@id='cart']/ul/li[2]/div/p/a[2]/strong")).click();
     
      driver.findElement(By.linkText("Checkout")).click();
      driver.findElement(By.name("firstname")).sendKeys("Rajiya");
      driver.findElement(By.name("lastname")).sendKeys("Shaik");
      driver.findElement(By.name("company")).sendKeys("Mj Group");
      driver.findElement(By.name("address_1")).sendKeys("Gurrala chavidi");
      driver.findElement(By.name("address_2")).sendKeys("ju street");
      driver.findElement(By.name("city")).sendKeys("cpt");
      driver.findElement(By.name("postcode")).sendKeys("533455");
     WebElement we= driver.findElement(By.name("country_id"));
     Select s = new Select (we);
     s.selectByVisibleText("India");
    
   WebElement we2=   driver.findElement(By.id("input-payment-zone"));
   Select s2 = new Select(we2);
   s.selectByVisibleText("Telangana");
      driver.findElement(By.id("button-payment-address")).click();
      
      driver.findElement(By.id("button-payment-address")).click();
      driver.findElement(By.name("payment_address")).click();//radio button
      driver.findElement(By.id("button-payment-address")).click();
      
}

}
