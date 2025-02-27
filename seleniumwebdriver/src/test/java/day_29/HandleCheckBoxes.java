package day_29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Select specific checkboxes
//		driver.findElement(By.id("sunday")).click();
		
		//Select All checkboxes
		List<WebElement> CheckBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
//		for(WebElement boxes : CheckBoxes) {
//			boxes.click();
//		}
		
		// Select last 3 checkboxes
//		for(int i=4;i<CheckBoxes.size();i++) {
//			CheckBoxes.get(i).click();
//		}
		
		//select first 3 checkboxes
//		for(int i=0;i<3;i++) {
//			CheckBoxes.get(i).click();
//		}
		
		//Unselect the checkboxes if they are selected
		for(int i=0;i<3;i++) {
			CheckBoxes.get(i).click();
		}
		
		Thread.sleep(5000);
		
		for(int i=0;i<CheckBoxes.size();i++) {
			if(CheckBoxes.get(i).isSelected()) {
			CheckBoxes.get(i).click();
			}
		}
		
		
	}
}
