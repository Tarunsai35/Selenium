package day_35;

import java.awt.Button;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_35 {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement BankDrag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement BankDrop = driver.findElement(By.id("bank"));
		
		WebElement BankAmountDrag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement BankAmountDrop = driver.findElement(By.id("amt7"));
		
		WebElement saleDrag = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement saleDrop = driver.findElement(By.id("loan"));
		
		WebElement SaleAmountDrag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement SaleAmountDrop = driver.findElement(By.id("amt8"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(BankDrag, BankDrop).build().perform();
		act.dragAndDrop(BankAmountDrag,BankAmountDrop).build().perform();
		act.dragAndDrop(saleDrag,saleDrop).build().perform();
		act.dragAndDrop(SaleAmountDrag,SaleAmountDrop).build().perform();
		
		boolean Button = driver.findElement(By.xpath("//a[text()='Perfect!']")).isDisplayed();
		System.out.println(Button);
		
		driver.quit();
		
	}
}
