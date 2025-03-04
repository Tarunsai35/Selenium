package day_32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> SearchList = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println("Nunber of suggestion : "+SearchList.size());
		
		for(WebElement list : SearchList) {
			String text = list.getText();
			System.out.println("Suggestion : "+text);
			
			if(text.equals("selenium")) {
				list.click();
				break;
			}
		}
	}
}
