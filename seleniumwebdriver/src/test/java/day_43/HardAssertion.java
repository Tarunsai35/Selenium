package day_43;

import org.testng.Assert;

public class HardAssertion {

	@org.testng.annotations.Test
	void Test() {
		
//		Assert.assertEquals("abc", "abc"); //passed
//		Assert.assertEquals("abc", "abd"); //Failed
		
//		Assert.assertEquals("abc", 123); //Failed
//		Assert.assertEquals(123, 123); //Passed
		
//		Assert.assertEquals(123, 1231); //Failed

//		Assert.assertTrue(true); //Passed
//		Assert.assertTrue(false); //Failed
		
//		Assert.assertFalse(false); //Passed
//		Assert.assertFalse(true); //Failed
		
		Assert.fail();
		
		
		
	}
	
}
