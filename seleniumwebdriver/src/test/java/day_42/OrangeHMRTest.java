package day_42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//openApplication
//logo present or not
//login
//logout

public class OrangeHMRTest {

	WebDriver driver;

	@Test(priority = 1)
	void openapp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	void testlogo() {
		boolean status = driver
				.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']"))
				.isDisplayed();
		System.out.println("Logo display : " + status);
	}

	@Test(priority = 3)
	void testlogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 4)
	void testlogout() {
		driver.quit();
	}
}
