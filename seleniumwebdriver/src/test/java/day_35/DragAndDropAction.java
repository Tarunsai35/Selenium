package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Washington = driver.findElement(By.id("box3"));
		WebElement us = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		
		//Drag and drop 1
		act.dragAndDrop(Washington, us).perform();
		
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));

		//Drag and drop 2
		act.dragAndDrop(Stockholm, Sweden).perform();
		
		
		
	}
}
