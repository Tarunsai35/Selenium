package day_31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("(//span[@class='multiselect-selected-text'])[1]")).click();
		
		//for single select
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//for multi select
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
		System.out.println("Number of options : "+options.size());
		
		//print the options
		for(WebElement opt : options) {
			System.out.println("The options : "+opt.getText());
		}
		
		//Multi select options
		List<WebElement> multiOption = driver.findElements(By.xpath("//label[@class='checkbox']"));
		
		for(WebElement multi : multiOption) {
			String option = multi.getText();
			if(option.equals("java")|| option.equals("C#")) {
				multi.click();
			}
		}
		
	}
}
