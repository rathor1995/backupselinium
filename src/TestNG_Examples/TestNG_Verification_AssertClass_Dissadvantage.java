package TestNG_Examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Dissadvantage
{
@Test
public void test()
{
	Reporter.log("Running Test Method",true);
	String act = "hi";
	String exp = "hello";
	boolean result=false;
	
	//Verification1
	Assert.assertNotEquals(act, exp);
	
	//Verification2
			Assert.assertEquals(act, exp);
			
			//Verification3
			Assert.assertTrue(result, "act Result is false");
		
			
			
}
}
