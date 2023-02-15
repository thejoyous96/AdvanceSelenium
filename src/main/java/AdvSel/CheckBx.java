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
		
		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		
		WebElement box1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement box2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
				
		
		Thread.sleep(3000);

	
		if (box1.isSelected()) {
			
			System.out.println("CheckBox 1 was already selected");

		}
		
		else 
		
		{
			box1.click();
		}
		
		
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}

