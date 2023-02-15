package AdvSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement f = driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		
		WebElement t = driver.findElement(By.xpath("//div[text()='United States']"));
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(f, t).perform();
		
		
		Thread.sleep(4000);
		
		
		driver.close();
		
	}
}
