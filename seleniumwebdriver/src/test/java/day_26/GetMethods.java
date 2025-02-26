package day_26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
		System.out.println(driver.getTitle());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//getWindowHandle()---> return single id
		String single_id = driver.getWindowHandle();
		System.out.println(single_id); //single id
		
		driver.findElement(By.xpath("OrangeHRM, Inc")).click();
		
		//getWindoehandles()---> return Multi id
		Set<String> multi_id = driver.getWindowHandles();
		System.out.println(multi_id); // multi id`s
		
	}
}
