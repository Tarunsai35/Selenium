package day_43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {

	@BeforeMethod
	void Login() {
		System.out.println("This is Login");
	}
	
	@Test(priority = 1)
	void Search() {
		System.out.println("This is Search");
	}
	
	@AfterMethod
	void Logout() {
		System.out.println("This is Logout");
	}
	
	@Test(priority = 2)
	void AdvSearch() {
		System.out.println("This is Adv Search");
	}
}
