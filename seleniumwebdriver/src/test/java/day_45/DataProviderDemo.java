package day_45;

import static org.testng.Assert.fail;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "db")
	void testLogin(String email, String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status == true) {
			System.out.println("Going to logout...");
			driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
			driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']"));
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	
	@DataProvider(name="db", indices = {0,1})
	Object[][] LoginData() {
		
		Object data [][] = {{"tarunsai@gmail.com","tarun@123123"},
							{"sai@gmail.com","tarun@"},
							{"tar123@gmail.com","tar123"},
							{"kumardd@gmail.com","kumar@123"},
							{"tarunsai","123"}
							};
		return data;
	}
	
}
