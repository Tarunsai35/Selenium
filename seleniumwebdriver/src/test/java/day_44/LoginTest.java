package day_44;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 1,groups = "sanity")
	void loginByEmail() {
		System.out.println("This is login");
	}
	@Test(priority = 2,groups = "sanity")
	void loginByFaceBook() {
		System.out.println("This is FaceBook");
	}
	@Test(priority = 3,groups = "sanity")
	void loginByTwitter() {
		System.out.println("This is Twitter");
	}
}
