package day_36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.id("inputText1")).sendKeys("Welcome");
		
		driver.findElement(By.xpath(""));
		
		
	}
}
