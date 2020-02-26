package IRCTC;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class captcha_Programs {

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
		
		 System.setProperty("webdriver.chrome.driver", "c://drivers/chromedriver.exe");
		 
		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("--disable-notifications");
		 
		 ChromeDriver driver = new ChromeDriver(opt);
		  Thread.sleep(1000);
		  driver.get("https://www.irctc.co.in/nget/train-search");
		 // driver.manage().window().maximize();
		  driver.findElement(By.id("loginText")).click();
		  driver.manage().window().maximize();
		 File f1=  driver.findElement(By.id("nlplogo")).getScreenshotAs(OutputType.FILE);
		 String path=System.getProperty("user.dir")+"/Screenshot/captcha.png";
		  File f2 = new File(path);
		  FileHandler.copy(f1, f2);
		  
		  ITesseract image = new Tesseract(); 
		  
		  String imageText = image.doOCR(new File(path));
		  
		  String finalText = imageText.split("below")[1].replaceAll("[^a-zA-Z0-9]","");
		  System.out.println(finalText);

	}

}
