package day_32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_32 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		
		WebElement DepartureCity = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement DestinationCity = driver.findElement(By.xpath("//select[@name='toPort']"));
		DepartureCity.click();
		Thread.sleep(5000);
		DestinationCity.click();
		
		
		
		
		
	}
}
