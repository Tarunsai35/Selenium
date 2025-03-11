package day_38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BloackingAds {

public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File file = new File(""); ////file of the extendions path -- blockerfile.crx
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		System.out.println("Current url : "+driver.getCurrentUrl());
		
		
	}

}

