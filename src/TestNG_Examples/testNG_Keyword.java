package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_Keyword 
{
@Test
public void login1()
{Reporter.log("running login TC",true);}
	
@Test(timeOut=8000)
public void login2() throws InterruptedException
{
	Thread.sleep(9000);
	Reporter.log("running login TC",true);
	}

@Test(dependsOnMethods = {"login1","login2"})
public void logout()
{Reporter.log("running login TC",true);}
	
	
	
	
//	@Test(timeOut=8000)
//	public void TC2() throws InterruptedException
//	{
//		Thread.sleep(9000);
//		Reporter.log("running TC2",true);
//	}
	
	
	
	
	//@Test(enabled=false )
	//public void TC1()
	//{Reporter.log("runningTC1", true);}

    //@Test
	//public void TC2() 
	//{Reporter.log("runningTC2", true);}
	
	
	
//@Test(priority=4 )
//public void TC1()
//{Reporter.log("runningTC1", true);}

//@Test(priority=3)
//public void TC2() 
//{Reporter.log("runningTC2", true);}


	
//@Test(invocationCount=10)
//public void TC1()
//{Reporter.log("runningTC1", true);}
	
	
}
