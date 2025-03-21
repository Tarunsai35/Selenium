package day_43;

import org.testng.annotations.*;

public class AllAnnotation {

	@BeforeSuite
	void bs() {
		System.out.println("This is BeforeSuit....");
	}
	@AfterSuite
	void as() {
		System.out.println("This is AfterSuit....");
	}
	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest....");
	}
	@AfterTest
	void at() {
		System.out.println("This is AfterTest....");
	}
	@BeforeClass
	void bc() {
		System.out.println("This is BeforeClass....");
	}
	@AfterClass
	void ac() {
		System.out.println("This is AfterClass....");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("This is BeforeMethod....");
	}
	@AfterMethod
	void am() {
		System.out.println("This is AfterMethod....");
	}
	
	@Test(priority = 1)
	void tm1() {
		System.out.println("This is Test Method_1");
	}
	@Test(priority =2)
	void tm2() {
		System.out.println("This is Test Method_2");
	}
	
	
}
