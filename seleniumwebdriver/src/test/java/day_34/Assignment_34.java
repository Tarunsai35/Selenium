package day_34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_34 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		driver.get("https://dummy-tickets.com/buyticket");
		
		//given data
		String from = "hyd", to = "goa";
		
		driver.findElement(By.xpath("//a[normalize-space()='Both']")).click();
		
		 WebElement RoundTrip = driver.findElement(By.xpath("//input[@value='roundtripfh']"));
		 RoundTrip.click();
		 
		 Thread.sleep(5000);
		 
		 //------------FOR SELECT THE FROM-------------------
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
}
}
