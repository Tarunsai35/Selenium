package day_30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1");
		driver.switchTo().defaultContent();
		
		//Frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2");
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("frame3");
		
		//Inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click(); //radio button
//		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();//checkboxes
		driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']")).click();//dropdown
		
	}
}
