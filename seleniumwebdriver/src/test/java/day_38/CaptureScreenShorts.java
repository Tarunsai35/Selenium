package day_38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShorts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//full page Screenshort
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//		File des = new File(System.getProperty("user.dir")+"\\ScreenShort\\fullpage.png");
//		scr.renameTo(des);
		
		// Take screenShort of specific section
//		WebElement featuredProduct = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
//		
//		File src = featuredProduct.getScreenshotAs(OutputType.FILE);
//		File des = new File(System.getProperty("user.dir") + "\\ScreenShort\\featuredProduct.png");
//		src.renameTo(des);
//	   
		// Take screenShort of specific webelement
		WebElement logoimg = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		File src = logoimg.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\ScreenShort\\logoimg.png");
		src.renameTo(des);
		
	}
}
