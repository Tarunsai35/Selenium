package day_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//#id <---->  tag #id
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Shirt");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		
		//tag class  <----> tag.classname
		//driver.findElement(By.cssSelector("button.button-1")).click();
		//driver.findElement(By.cssSelector(".button-1")).click();
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("apple");
		
		
		
	}
}
