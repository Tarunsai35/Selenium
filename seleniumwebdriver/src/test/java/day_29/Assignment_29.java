package day_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_29 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mypage.rediff.com/");
		
		driver.findElement(By.name("id")).sendKeys("sai");
		driver.findElement(By.id("pass_box"));
		driver.findElement(By.xpath("//input[@value=' Go ']")).click();
		
	}
}
