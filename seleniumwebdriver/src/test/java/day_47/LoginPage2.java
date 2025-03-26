package day_47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 { 		// With PageFactory

	WebDriver driver;
	//Constructor
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locator
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_pwd;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_login;
	
	//Action method
	 
	public void getUserName() {
		txt_username.sendKeys("Admin");
	}
	public void getPassword() {
		txt_pwd.sendKeys("admin123");
	}
	public void ClickLogin() {
		btn_login.click();
	}

	
	
	
}
