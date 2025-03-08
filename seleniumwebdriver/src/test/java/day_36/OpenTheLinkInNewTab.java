package day_36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act = new Actions(driver);
		//Control+Click
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		//shifthing the tabs
		List<String> ids = new ArrayList<String>(driver.getWindowHandles());
		
		//registion page
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.id("FirstName")).sendKeys("tarun");
		
		//Home page
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.id("small-searchterms")).sendKeys("Tshirt");
		
	}
}
