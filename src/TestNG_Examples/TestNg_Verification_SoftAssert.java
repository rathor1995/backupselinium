package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Verification_SoftAssert 
{
	@Test
	public void test()
	{
		Reporter.log("Running Test Method",true);
		String act = "hi";
		String exp = "hello";
		boolean result=false;
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertNotEquals(act, exp,"both result are same");
		
		soft.assertAll();
		
}
}