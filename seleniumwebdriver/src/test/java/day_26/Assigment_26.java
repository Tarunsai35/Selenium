package day_26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class Assigment_26 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//get
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//getCurrentUrl
		System.out.println("Current Url : "+driver.getCurrentUrl());
		
		//gettitle
		System.out.println("Title Page : "+driver.getTitle());
		
		//getPageSource
		System.out.println("Page Source code : "+driver.getPageSource());
		
		//Single Window id
		System.out.println("Single window id : "+driver.getWindowHandle());
		
		//Multiple window`s id
		WebElement NewTab = driver.findElement(By.xpath("//button[normalize-space()='New Tab']"));
		NewTab.click();
		Set<String> Multi_id = driver.getWindowHandles();
		System.out.println("Multi Window id : "+Multi_id);
		
		//isDisplayed
		boolean Enable_name = driver.findElement(By.id("name")).isDisplayed();
		System.out.println("Status of Name : "+Enable_name);
		
		//isDisplayed
		boolean Enable_email= driver.findElement(By.id("email")).isDisplayed();
		System.out.println("Status of email : "+Enable_email);
		
		//isDisplayed
		boolean male = driver.findElement(By.cssSelector("label[for='male']")).isDisplayed();
		System.out.println("Display of gender : "+male);
		
		//Click on male radio button
		driver.findElement(By.id("male")).click();
		
		//isEnabled
		male = driver.findElement(By.cssSelector("label[for='male']")).isEnabled();
		System.out.println("Status of male : "+male);
		
		//isEnabled
		boolean female = driver.findElement(By.cssSelector("label[for='female']")).isEnabled();
		System.out.println("Status of female : "+female);
		
		//isSelected
		boolean Select_date_range = driver.findElement(By.xpath("//div[@class='post-footer-line post-footer-line-1']")).isSelected();
		System.out.println("Status of date : "+Select_date_range);
		
		// close all browsers
		driver.quit();
	}
}
