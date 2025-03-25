package day_45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br, String url) throws InterruptedException {
		
		switch (br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver();break;
		case "firefox": driver = new FirefoxDriver();break;
		case "edge": driver = new EdgeDriver();break;
		default:System.out.println("Invalid Browser"); return;
		}
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(url);   // from xml file
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	void testLogo() {
		boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void testUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 3)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}
