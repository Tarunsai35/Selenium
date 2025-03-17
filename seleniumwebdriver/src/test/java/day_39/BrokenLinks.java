package day_39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int noofbrokenlinks =0;
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : "+links.size());
		for(WebElement linkElement : links) {
			String hrefAttValue = linkElement.getAttribute("href");
			if(hrefAttValue==null || hrefAttValue.isEmpty()) {
				System.out.println("href value is empty. So No posssible to check");
				continue;
			}
			
			try {
				URL linkurl = new URL(hrefAttValue); //convert herf value string to url fromate
				HttpURLConnection connection =(HttpURLConnection) linkurl.openConnection(); //open connection to url
				connection.connect(); //connection to server and send response the server
				
				if(connection.getResponseCode()>=400) {
					System.out.println(hrefAttValue +" : broken link");
					noofbrokenlinks++;
				}else {
					System.out.println(hrefAttValue +" : not a broken link");
				}
			}catch (Exception e) {
			}
		}
		System.out.println("No of Broken links : "+noofbrokenlinks);
	}

}
