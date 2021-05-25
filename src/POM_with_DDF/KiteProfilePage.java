package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfilePage 
{
@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement PN;
@FindBy(xpath="//a[@target=\"_self\"]")private WebElement LOGOUT;


public KiteProfilePage (WebDriver driver)
{PageFactory.initElements(driver,this);}

public void ClickKiteProfilePagePN()
{PN.click();}
public void ClickKiteProfilePageLOGOUT()
{LOGOUT.click();}
}
