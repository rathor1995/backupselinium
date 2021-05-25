package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample5 
{
	@Test 
	public void TC4()
	{Reporter.log("Running TC4");}

	@Test 
	public void TC5()
	{Reporter.log("Running TC5");}

	@Test (enabled=false)
	public void TC6()
	{Reporter.log("Running TC6");}

}
