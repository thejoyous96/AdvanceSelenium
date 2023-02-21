package AdvSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TheMouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement a = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		WebElement b = driver.findElement(By.xpath("(//span[@class='nav-text'])[4]"));
		
		
		Actions act = new Actions (driver); 
		
		act.moveToElement(a).moveToElement(b).click().build().perform();
		
		
		Thread.sleep(3000); 
		
		
		driver.close();
		
	}
}
