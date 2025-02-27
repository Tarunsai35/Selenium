package day_28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String window_id = driver.getWindowHandle();
		System.out.println(window_id);
		
		 Set<String> multi_window_id = driver.getWindowHandles();
		System.out.println(multi_window_id);
		
		//Approach 1
		List<String> window_list = new ArrayList<String>(multi_window_id);
		
		String Parent_id = window_list.get(0);
		String Child_id = window_list.get(1);
		
//		System.out.println(a+" "+b);
		
//		System.out.println(driver.getTitle());
		
		//Switch to child window
		driver.switchTo().window(Child_id);
		System.out.println(driver.getTitle());
		
		//Switch to parent window
		driver.switchTo().window(Parent_id);
		System.out.println(driver.getTitle());
		
		//Approach 2
		for(String winds:window_list) {
			
			String title = driver.switchTo().window(winds).getTitle();
			
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		driver.quit();
	}
}
