package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment23 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		//#id
		driver.findElement(By.cssSelector("#form-currency")).click();
		
		//tag.classname
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("iphone");
		
		//tag attribute
		driver.findElement(By.cssSelector("button[class='btn btn-light btn-lg']")).click();
		
		driver.quit();
		
	}
}
