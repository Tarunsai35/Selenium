package day_31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_31 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement selectCountry = driver.findElement(By.id("country"));
		selectCountry.click();
		
		//count of options
		List<WebElement> listOfOptions = driver.findElements(By.xpath("//select[@class='form-control']/option"));
		System.out.println("Number of Country : "+listOfOptions.size());
		
		//print all options
		for(WebElement list : listOfOptions) {
			System.out.println("The option : "+list.getText());
		}
		
		Thread.sleep(5000);
		
		//select one option
		for(int i=0; i<listOfOptions.size();i++) {
		String	text = listOfOptions.get(i).getText();
			if (text.equals("Germany")) {
				listOfOptions.get(i).click();
			}
		}
		
//		driver.quit();
	}
}
