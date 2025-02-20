package day_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {     //token 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

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/watch?v=gG1Wa6XnIUU");
		System.out.println("title of page"+driver.getTitle());
		System.out.println("url of page"+driver.getCurrentUrl());
		driver.quit();
		
	}
}
