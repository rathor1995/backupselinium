package TestNG_Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample7_group
{
@Test(groups={"dashboard"})
public void TC1()
{Reporter.log("Running TC1");}

@Test(groups={"Payment"})
public void TC2()
{Reporter.log("Running TC2");}

@Test(groups={"order"})
public void TC3()
{Reporter.log("Running TC3");}

@Test(groups={"dashboard"})
public void TC4()
{Reporter.log("Running TC4");}

@Test(groups={"dashboard"})
public void TC5()
{Reporter.log("Running TC5");}


}
