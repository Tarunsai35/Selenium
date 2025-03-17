package day_39;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SVGElements {

	public static void main(String[] args) {
		
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless=new");
//			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			
//			driver.findElement(By.className("oxd-icon oxd-main-menu-item--icon")).click();
			
//			driver.findElement(By.xpath("//buttton[@title='Timesheets']//*[name()='svg']")).click();
	}
}
