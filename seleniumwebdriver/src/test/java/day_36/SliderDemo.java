package day_36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		// for minimum slider
		WebElement min_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 0%;']"));
		System.out.println("current location of Minimum slider : "+min_slider.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("location after moving min slider: "+min_slider.getLocation());
		
		// for Maxminim slider
		WebElement max_slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 100%;']"));
		System.out.println("current location of Maximum : "+max_slider.getLocation());
		act.dragAndDropBy(max_slider, -100, 289).perform();
		System.out.println("location after moving max sider: "+max_slider.getLocation());
		
		
 		driver.quit();
	}
}
