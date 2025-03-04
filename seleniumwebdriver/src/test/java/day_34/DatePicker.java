package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//Switch
		driver.switchTo().frame(0);
		
		//using SendKeys()
//		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/05/2020");
		
		//select the month and year
		//using datepicker
		String year = "2026";
		String month = "may";
		String date = "25";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if(currentmonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		//select the date
		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt : allData) {
			if(dt.getText().equals(date)){
				dt.click();
				break;
			}
		}
	}
}
