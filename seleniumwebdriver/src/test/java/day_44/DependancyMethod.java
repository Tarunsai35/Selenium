package day_44;

import org.testng.Assert;
import org.testng.annotations.*;

public class DependancyMethod {
	
	@Test(priority = 1)
	void openApp() {
		System.out.println("This is Open Application...");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods = {"openApp"})
	void Login() {
		System.out.println("This is Login...");
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = {"Login"})
	void Search() {
		System.out.println("This is Search...");
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4, dependsOnMethods = {"Login","Search"})
	void AdvSearch() {
		System.out.println("This is Advance Search...");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5, dependsOnMethods = {"Login"})
	void Logout() {
		System.out.println("This is Logout...");
		Assert.assertTrue(true);
	}
}
