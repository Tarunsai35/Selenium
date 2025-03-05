package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_34 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		driver.get("https://dummy-tickets.com/buyticket");
		
		//given data
		String from = "hyd", to = "goa";
		String Year= "2025", Month= "Jun", Date= "20"; //for departure
		String RYear= "2025", RMonth= "Dec", RDate= "10"; //for return
		String CityName = "hyd";
		
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
		
		 WebElement RoundTrip = driver.findElement(By.xpath("//input[@value='roundtripfh']"));
		 RoundTrip.click();
		 
		 Thread.sleep(5000);
		 
/*		 //------------FOR SELECT THE FROM-------------------
		 //pass the value
		 WebElement FromXpath = driver.findElement(By.xpath("//form[@id='both_round']//div//div//label/following-sibling::input"));
		 FromXpath.click();
		 Thread.sleep(5000);
		 FromXpath.sendKeys(from);
		 Thread.sleep(5000);
		 //select the first option from dropdown
		 List<WebElement> Fromlist = driver.findElements(By.xpath("//form[@id='both_round']//div//div//ul//li//div/p"));
		 System.out.println(Fromlist.size());
		 
		 for(WebElement list_From : Fromlist) {
			Thread.sleep(3000);
			String text = list_From.getText();
			System.out.println("Suggestion : "+text);
			list_From.click();
			break;
		 }
		 
		 
		 Thread.sleep(5000);
		 
		 //------------FOR SELECT THE TO-------------------
		 //pass the value
		 WebElement TOXpath = driver.findElement(By.xpath("(//form[@id='both_round']//div//div//following-sibling::input)[2]"));
		 TOXpath.click();
		 Thread.sleep(5000);
		 TOXpath.sendKeys(to);
		 Thread.sleep(5000);
		 //select the first option from dropdown
		 List<WebElement> Tolist = driver.findElements(By.xpath("//form[@id='both_round']//div//div[2]//ul//li//div/p"));
		 System.out.println(Tolist.size());
		 
		 for(WebElement list_To : Tolist) {
			 Thread.sleep(3000);
			 String text = list_To.getText();
			 System.out.println("Suggestion : "+text);
			 list_To.click();
			 break;
		 }
		 
*/		 Thread.sleep(3000);
		 
		 //------------FOR SELECT THE DEPARTURE-------------------
		 //
		 WebElement DepartureXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[2]//div//input[@placeholder='Departure Date']"));
		 DepartureXpath.click();
		 Thread.sleep(5000);
		 WebElement MonthXpath = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 MonthXpath.click();
		 Select MonthSelect = new Select(MonthXpath);
		 MonthSelect.selectByVisibleText(Month);
		 System.out.println("Month as be selected : "+Month);
		 Thread.sleep(5000);
		 List<WebElement> DateXpath = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		 
		 for(WebElement dt : DateXpath) {
			 if(dt.getText().equals(Date)) {
				 dt.click();
				 break;
			 }
		 }
		 
		 //------------FOR SELECT THE RETURN-------------------
		 //
		 WebElement ReturnXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[2]//div//following-sibling::div//input[@placeholder='Return Date']"));
		 ReturnXpath.click();
		 Thread.sleep(5000);
		 MonthXpath = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 MonthXpath.click();
		 MonthSelect = new Select(MonthXpath);
		 MonthSelect.selectByVisibleText(RMonth);
		 System.out.println("Month as be selected : "+ RMonth);
		 Thread.sleep(5000);
		 DateXpath = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		 
		 for(WebElement dt : DateXpath) {
			 if(dt.getText().equals(RDate)) {
				 dt.click();
//				 System.out.println("Selected Date : "+dt.getText());
				 break;
			 }
		 }
		 
		 Thread.sleep(5000);
		 
		 //-------------------For Select City----------------
		 //
		 WebElement CityXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[4]//div/div/input[@name='city[]']"));
		 CityXpath.click();
		 Thread.sleep(3000);
		 CityXpath.sendKeys(CityName);
		 List<WebElement> CityList = driver.findElements(By.xpath("//form[@id='both_round']//div[4]//div//ul/li/div/p"));
		 System.out.println(CityList.size());
		 
		 for(WebElement list_city : CityList) {
				Thread.sleep(3000);
				list_city.click();
				break;
			 }
		 
		 Thread.sleep(3000);
		
		 //-------------------For Select CheckIN----------------
		 
		 WebElement CheckinXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[4]//div[2]//div/input[@name='checkin[]']"));
		 CheckinXpath.click();
		 Thread.sleep(3000);
		 MonthXpath = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 MonthXpath.click();
		 MonthSelect = new Select(MonthXpath);
		 MonthSelect.selectByVisibleText(RMonth);
		 System.out.println("Month as be selected : "+ RMonth);
		 Thread.sleep(5000);
		 DateXpath = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		 
		 for(WebElement dt : DateXpath) {
			 if(dt.getText().equals(RDate)) {
				 dt.click();
				 break;
			 }
		 }
		
		 Thread.sleep(3000);
		 
		 //-------------------For Select CheckOut----------------
		 
		 WebElement CheckoutXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[4]//div[2]//div[2]//input[@name='checkout[]']"));
		 CheckoutXpath.click();
		 Thread.sleep(3000);
		 MonthXpath = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		 MonthXpath.click();
		 MonthSelect = new Select(MonthXpath);
		 MonthSelect.selectByVisibleText(RMonth);
		 System.out.println("Month as be selected : "+ RMonth);
		 Thread.sleep(5000);
		 DateXpath = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		 
		 for(WebElement dt : DateXpath) {
			 if(dt.getText().equals(RDate)) {
				 dt.click();
				 break;
			 }
		 }
		 
		 Thread.sleep(3000);
		 
		 // Select Submit Buttom
		 WebElement SubmitXpath = driver.findElement(By.xpath("//form[@id='both_round']//div[7]//div//input"));
		 SubmitXpath.click();
	}
}
