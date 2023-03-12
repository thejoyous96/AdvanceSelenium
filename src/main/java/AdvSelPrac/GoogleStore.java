package AdvSelPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStore {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriverManager.chromedriver().setup();
				
		WebDriver driver = new ChromeDriver();
				
				
		driver.get("https://www.google.com/");
				
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				
		WebElement Store = driver.findElement(By.xpath("//a[contains(text(),'Store')]"));
				
		Actions act1 = new Actions (driver); 
				
		act1.moveToElement(Store).click().build().perform();
				
				
		WebElement EarBuds = driver.findElement(By.xpath("//a[contains(text(),'Earbuds')]"));
				
		Actions act2 = new Actions (driver); 
				
		act2.moveToElement(EarBuds).click().build().perform();

				
		WebElement item = driver.findElement(By.xpath("(//div[@class='mqn2-hgi'])[1]"));
				
		Actions act3 = new Actions (driver); 
				
		act3.moveToElement(item).click().build().perform();	
				
				
		Thread.sleep(10000);
				
				
		driver.close();
				
						
		System.out.println("");
				
		
		System.out.println("You have selected the item: Pixel Buds Pro.");

	}
}
