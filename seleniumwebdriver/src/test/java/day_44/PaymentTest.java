package day_44;

import org.testng.annotations.Test;

public class PaymentTest {

	@Test(priority = 1,groups = {"regression", "sanity", "functional"})
	void PaymentByFaceBook() {
		System.out.println("This is Payment by FaceBook");
	}
	
	@Test(priority = 2,groups = {"regression", "sanity", "functional"})
	void PaymentByTwitter() {
		System.out.println("This is Payment by Twitter");
	}
}
