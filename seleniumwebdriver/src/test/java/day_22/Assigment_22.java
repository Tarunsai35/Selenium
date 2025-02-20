package day_22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment_22 {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demoblaze.com/index.html");
		
		//Total Links In Webpages
		 List<WebElement> Total_links = driver.findElements(By.tagName("a"));
		 System.out.println("Total Linke : "+ Total_links.size());
		 
		 // Total Images In Webpage
		 List<WebElement> Total_images = driver.findElements(By.tagName("img"));
		 System.out.println("Total images : "+Total_images.size());
		 
		 //Click On Product 
		 driver.findElement(By.partialLinkText("Nexus 6")).click();
		 
		 driver.quit();
		 
		 
	}
}
