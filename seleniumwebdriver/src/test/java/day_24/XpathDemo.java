package day_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		
		//Xpath for Single Attribute
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Phone");
		
		//Xpath for Multi Attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("phone");
		
		//Xpath with 'AND' & 'OR' Operator
		//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("Phone");
		//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Phone");
		
		//Xpath with inner text
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		
		//Xpath with Contains
		//driver.findElement(By.xpath("//input[contains(@placeholder,'sea')]")).sendKeys("phone");
		
		//Xpath with Star-with
		driver.findElement(By.xpath("//input[start-with(@placeholder,'sea')]")).sendKeys("phone");
		
		//Chianed Xpath
		boolean Status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(Status);
	}
}
