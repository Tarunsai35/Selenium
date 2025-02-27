package day_29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Click OK Button
		driver.findElement(By.id("alertBtn")).click();
		Alert myalert = driver.switchTo().alert();
		myalert.accept();
		
		// Click Ok and Cancel Button
		WebElement confirm = driver.findElement(By.id("confirmBtn"));
		confirm.click();
		myalert.accept();
		Thread.sleep(5000);
		confirm.click();
		myalert.dismiss();
		
		// Send Message or cancel button
		WebElement promt = driver.findElement(By.id("promptBtn"));
		promt.click();
		myalert.sendKeys("sai");
		myalert.accept();
		Thread.sleep(5000);
		promt.click();
		myalert.dismiss();
		
		//
		
	}
}
