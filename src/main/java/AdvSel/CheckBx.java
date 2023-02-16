package AdvSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBx {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		
		Thread.sleep(4000);

		
		WebElement B1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		if (!B1.isSelected()) {
           		
			B1.click();
						
			System.out.println("Box 1 was Selected.");

        }
		
		else {
						 
			System.out.println("Box 1 is already Selected.");

		}
		
		
		WebElement B2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	
		if (!B2.isSelected()) {
	           
			
			B2.click();
						
			System.out.println("Box 2 was Selected.");

        }
		
		else {
			
			System.out.println("Box 2 is already Selected.");
			
		}
		
		
		Thread.sleep(4000);
		
		
		driver.close();
		
	}

}

