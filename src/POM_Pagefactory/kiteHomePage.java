package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage 
{
@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement PN;

public kiteHomePage (WebDriver driver)
{PageFactory.initElements(driver, this);}

public void verifyPN()
{
String actPN= PN.getText();
String expPN="DV1510";
if(actPN.equals(expPN))
{System.out.println("pass");}
else
{System.out.println("fail");}
}
}
