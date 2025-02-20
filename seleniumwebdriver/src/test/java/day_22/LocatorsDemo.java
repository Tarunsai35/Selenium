package day_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		// name
		driver.findElement(By.name("search")).sendKeys("iphone");
		
		//id
		boolean logo_status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo_status);
		
		//classname
		 List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));
		 
		 System.out.println(headerlinks.size());
		 
		//linkText & 
		driver.findElement(By.linkText("Desktops")).click();
		
		//PartialLinkText
		driver.findElement(By.partialLinkText("Notebook")).click();
		
		//Tagname
		List<WebElement> Tagnames = driver.findElements(By.tagName("a"));
		System.out.println(Tagnames.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		driver.quit();
		
	}
}
