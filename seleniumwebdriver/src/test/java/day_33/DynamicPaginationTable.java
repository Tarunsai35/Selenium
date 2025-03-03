package day_33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@data-bs-toggle='collapse' and @class=\"parent\"]")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//li[1]")).click();
		
		// Showing 1 to 10 of 19358 (1936 Pages)
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int totalPage = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("page")-1));
		
		//repeating pages
		for(int p=1;p<=5;p++) {
			
			if(p>1) {
				WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='"+p+"']"));
				activePage.click();
			}
			
			//Read data form the pages
			int NoOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int r=1;r<=NoOfRows;r++) {
		
				String usernames = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
				String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
				
				System.out.println(usernames+"\t"+email+"\t"+status);
			}
		}
		
		
		
		
	}
}
