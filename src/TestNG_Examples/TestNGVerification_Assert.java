package TestNG_Examples;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGVerification_Assert 
{
	 // 7.  assert  fail
	@Test
    public void test()
	{
	Reporter.log("Running test method",true);
	Assert.fail();
	}
	
	// 6.  assert  null
//		@Test
//	    public void test()
//		{
//		Reporter.log("Running test method",true);
//		String actResult = null ;
//		Assert.assertNull(actResult);
//		}
		
	
 // 5.  assert not null
//	@Test
//    public void test()
//	{
//	Reporter.log("Running test method",true);
//	String actResult = "cbbx" ;
//	Assert.assertNotNull(actResult);
//	}
	
	
//4.
//      @Test
//	     public void test()
//		{
//		Reporter.log("Running test method",true);
//		boolean actResult = false;
//		Assert.assertFalse(actResult, "act result is true");
//		}
			
	
//3. assertTrue	
//	@Test
//  public void test()
//	{
//	Reporter.log("Running test method",true);
//	boolean actResult = true;
//	Assert.assertTrue(actResult, "act result is true");
//	}
		
	
//2. assertNotEquals
//	@Test
//    public void test()
//	{
//	Reporter.log("Running test method",true);
//	String actResult= "Hello";
//	String expResult = "Hi";
//	Assert.assertNotEquals(actResult, expResult,"act & exp result are different");
//	}
	
	
//1. assert equals
//	@Test
//  public void test()
//	{
//	Reporter.log("Running test method",true);
//	String actResult= "Hello";
//	String expResult = "Hi";
//	Assert.assertEquals(actResult, expResult,"act & exp result are different");
//	}
}
