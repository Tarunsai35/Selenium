package day_31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement SelectCountry = driver.findElement(By.id("country"));
		
		//Select the option in dropdown
		Select sc = new Select(SelectCountry);
		
//		sc.selectByVisibleText("Germany");
//		sc.selectByValue("uk");
//		sc.selectByIndex(5);
		
		//capture options from the dropdown
		List<WebElement> option = sc.getOptions();
		System.out.println("Number of option in dropdown : "+option.size());
		
		//priting the options 
//		for(int i=0;i<option.size();i++) {
//			System.out.println("The option "+i+" : "+option.get(i).getText());
//		}
//		
		for(WebElement opt : option) {
			System.out.println(opt.getText());
		}
		
	}
}
