package AdvSelPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppleStore {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
				
		driver.get("https://www.apple.com/");
				
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement Act1 = driver.findElement(By.xpath("((//span[contains(text(),'iPhone')]))[1]"));
		
		Actions A = new Actions (driver); 
		
		A.moveToElement(Act1).click().build().perform();
		
		
		Thread.sleep(5000);
		

		WebElement Act2 = driver.findElement(By.xpath("((//span[contains(text(),'iPhone 14 Pro')]))[1]"));
		
		Actions B = new Actions (driver); 
		
		B.moveToElement(Act2).click().build().perform();
		
		
		Thread.sleep(5000);
		

		WebElement Act3 = driver.findElement(By.xpath("((//a[contains(text(),'Buy')]))[1]"));
		
		Actions C = new Actions (driver); 
		
		C.moveToElement(Act3).click().build().perform();
		
		
		Thread.sleep(5000);

		
		WebElement Act4 = driver.findElement(By.xpath("((//span[contains(text(),'iPhone 14 Pro')]))[1]")); //Model
		
		Actions D = new Actions (driver); 
		
		D.moveToElement(Act4).click().build().perform();
		
		
		Thread.sleep(5000);

		
		WebElement Act5 = driver.findElement(By.xpath("(//img[@class='colornav-swatch'])[4]")); //Space Black
		
		Actions E = new Actions (driver); 
		
		E.moveToElement(Act5).click().build().perform();
		
		
		Thread.sleep(3000);

		
		WebElement Act6 = driver.findElement(By.xpath("(//span[@class='column form-selector-left-col rf-bfe-selector-left-col'])[4]")); //256 GB
		
		Actions F = new Actions (driver); 
		
		F.moveToElement(Act6).click().build().perform();
	
		
		Thread.sleep(3000);

		
		WebElement Act7 = driver.findElement(By.xpath("(//span[@class='form-selector-title'])[7]")); //Trade-In 
		
		Actions G = new Actions (driver); 
		
		G.moveToElement(Act7).click().build().perform();
	
		
		Thread.sleep(3000);

		
		WebElement Act8 = driver.findElement(By.xpath("(//label[@class='form-selector-label rf-po-bfe-dimension-base-label'])[1]")); //Buy 
		
		Actions H = new Actions (driver); 
		
		H.moveToElement(Act8).click().build().perform();
		
		
		Thread.sleep(3000);
		
		
		WebElement Act9 = driver.findElement(By.xpath("//span[@class='form-selector-title rf-bfe-dimension-simfree']")); //Unlocked 
		
		Actions I = new Actions (driver); 
		
		I.moveToElement(Act9).click().build().perform();
		
		
		Thread.sleep(3000);
		
		
		WebElement Act10 = driver.findElement(By.xpath("//label[@id='applecareplus_58_noapplecare_label']")); //No AppleCare+ 
		
		Actions J = new Actions (driver); 
		
		J.moveToElement(Act10).click().build().perform();
		
	
		Thread.sleep(3000);
		
		
		WebElement Act11 = driver.findElement(By.xpath("//span[@class='label']")); //Add to Bag
		
		Actions K = new Actions (driver); 
		
		K.moveToElement(Act11).click().build().perform();
		
	
		Thread.sleep(3000);

		
		WebElement Act12 = driver.findElement(By.xpath("//button[@title='Review Bag']")); //Review Bag
		
		Actions L = new Actions (driver); 
		
		L.moveToElement(Act12).click().build().perform();
		
	
		Thread.sleep(3000);
		
		
		WebElement Act13 = driver.findElement(By.xpath("//button[@class='rs-iteminfo-remove as-buttonlink']")); //Remove Item
		
		Actions M = new Actions (driver); 
		
		M.moveToElement(Act13).click().build().perform();
		
	
		Thread.sleep(3000);
		
		
		driver.close();
		
		
	    System.out.println(" ");
	    
	    System.out.println("Your new iPhone was successfully added and removed from the cart.");  
				
	}

}
