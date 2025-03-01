package day_31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		//click on PIM
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		//click on dropdown
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[3]")).click();
		Thread.sleep(5000);
		
		//Slect single option
		//driver.findElement(By.xpath("//span[text()='HR Manager']")).click();
		
		//count number of options
		List<WebElement> multiOptions = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of options : "+multiOptions.size());
		
		//print options
		for(WebElement mult : multiOptions) {
			System.out.println("The options : "+mult.getText());
		}
		
		
		driver.quit();
		
	}
}
