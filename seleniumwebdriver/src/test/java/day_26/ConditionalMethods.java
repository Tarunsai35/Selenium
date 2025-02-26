package day_26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplay
		WebElement image = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean img = image.isDisplayed();
		System.out.println("Dispay status : "+img); // true
		
		//isEnable
		boolean Name = driver.findElement(By.id("FirstName")).isEnabled();
		System.out.println("Enable Status : "+Name); // true
		
		//isSelect
		boolean select = driver.findElement(By.id("Newsletter")).isSelected();
		System.out.println("Select Status : "+select);// true
		
		//isSelect ---- case 1
		 WebElement male = driver.findElement(By.id("gender-male"));
		 WebElement female = driver.findElement(By.id("gender-female"));
		
		 System.out.println("Before selected....");
		 System.out.println(male.isSelected());
		 System.out.println(female.isSelected());
		 
		 male.click();
		 female.click();
		 male.click();
		 
		 System.out.println("After selected....");
		 System.out.println(male.isSelected());
		 System.out.println(female.isSelected());
		 
		
//		driver.quit();
		
	}
}
