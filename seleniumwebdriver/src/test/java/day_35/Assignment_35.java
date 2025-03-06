package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_35 {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement fied1 = driver.findElement(By.id("field1"));
		WebElement field2 = driver.findElement(By.id("field2"));
		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
		Actions act = new Actions(driver);
		act.doubleClick(copy).perform();
		
		String message = field2.getAttribute("value");
		
		if(message.equals(fied1.getAttribute("value"))) {
			System.out.println(message);
		}else {
			System.out.println("empty message");
		}
		
		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(box1, box2).perform();
		
		//valide droped
		WebElement dropmessage = driver.findElement(By.xpath("//div[@id='droppable']//p"));
		System.out.println(dropmessage.getText());
		
		
	}
}
