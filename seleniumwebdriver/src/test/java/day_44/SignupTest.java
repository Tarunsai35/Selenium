package day_44;

import org.testng.annotations.Test;

public class SignupTest {

	@Test(priority = 1,groups = "regression")
	void SignupByEmail() {
		System.out.println("This is Signup by Emil...");
	}
	
	@Test(priority = 2,groups = "regression")
	void SignupByFaceBook() {
		System.out.println("This is Signup by FaceBook...");
	}
	
	@Test(priority = 3,groups = "regression")
	void SignupByTwitter() {
		System.out.println("This is Signup by Twitter...");
	}
}
