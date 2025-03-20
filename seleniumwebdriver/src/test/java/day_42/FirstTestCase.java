package day_42;

import org.testng.annotations.Test;

public class FirstTestCase {

	@Test(priority = 1)
	void openapp() {
		System.out.println("Opening Application...");
	}
	@Test(priority = 3)
	void login() {
		System.out.println("Login Application...");
	}
	@Test(priority = 2)
	void logout() {
		System.out.println("Logout Application...");
	}
}
