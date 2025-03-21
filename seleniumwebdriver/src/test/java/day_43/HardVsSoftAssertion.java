package day_43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {

//	@Test
	void Test_HardAssertion() {
		System.out.println("Testing...");
		Assert.assertEquals(1, 1);		//Pass
		Assert.assertEquals(1, 2);		//Fail and not execuit next line
		System.out.println("Testing...");
	}

	@Test
	void Test_SoftAssertion() {
		System.out.println("Testing...");
		
		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(1, 1);	//Pass
		sa.assertEquals(1,2);	//Pass and move to next line... but Test will be Failed
		
		System.out.println("Testing...");
		
		sa.assertAll(); //*** it mandatory..
	}
}
