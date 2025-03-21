package day_43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test
	void xyz() {
		System.out.println("This is xyz from C2");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is AfterTest Method..");
	}
}
