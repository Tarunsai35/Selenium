package day_47;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {		// Without PageFactory

	WebDriver driver;
	//Constructor
	LoginPage1(WebDriver driver){
		this.driver=driver;
	}
	//Locator
	 By txt_userName = By.xpath("//input[@placeholder='Username']");
	 By txt_pwd = By.xpath("//input[@placeholder='Password']");
	 By btn_login = By.xpath("//button[normalize-space()='Login']");
	
	//Action method
	 
	 public void getUserName() {
		 driver.findElement(txt_userName).sendKeys("Admin");
	 }
	 
	 public void getPassword() {
		 driver.findElement(txt_pwd).sendKeys("admin123");
	 }
	 
	 public void ClickLogin() {
		 driver.findElement(btn_login).click();
	 }
	 
	 
}
