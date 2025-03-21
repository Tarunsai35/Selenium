package day_43;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void TestTitle() {
		
		String exp_Title = "opencart";
		String act_Title = "opencartds";
		
//		if(exp_Title.equals(act_Title)) {
//			System.out.println("Test passed...");
//		}else {
//			System.out.println("Test fail...");
//		}
		
		
//		Assert.assertEquals(exp_Title, act_Title);
		
		if(exp_Title.equals(act_Title)) {
			System.out.println("Test passed...");
			Assert.assertTrue(true);
		}else {
			System.out.println("Test fail...");
			Assert.assertTrue(false);
		}
	}
}
