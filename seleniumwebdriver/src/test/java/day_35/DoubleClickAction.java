package day_35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/TAgs/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));
		
		Actions act = new Actions(driver);
		//double click action
		act.doubleClick(button).perform();
		// show the message
		String message = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Message : "+message);
		
	}
}
