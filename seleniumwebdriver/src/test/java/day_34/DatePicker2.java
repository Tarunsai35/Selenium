package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker2 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			String year= "2027", month = "May", date="15";
			
			driver.findElement(By.xpath("//input[@name='SelectedDate']")).click();
			
			WebElement YearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select sc = new Select(YearDropdown);
			sc.selectByVisibleText(year);
			
			Thread.sleep(5000);
			
			WebElement MonthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
			Select sc1 = new Select(MonthDropdown);
			sc1.selectByVisibleText(month);

			Thread.sleep(5000);
			
			//select the date
			List<WebElement> allData = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			
			for(WebElement dt : allData) {
				if(dt.getText().equals(date)){
					dt.click();
					break;
				}
			
			
	}
}
}