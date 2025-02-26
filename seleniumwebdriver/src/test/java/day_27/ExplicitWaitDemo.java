package day_27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

		UserName.sendKeys("Admin");
		Password.sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();

	}
}
