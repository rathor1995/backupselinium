package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage1
{
@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement PN;

public KiteHomePage1(WebDriver driver)
{PageFactory.initElements(driver, this);}

public void VerifyKiteHomePage1ProfileName(String expPN)
{String actPN = PN.getText();
if(actPN.equals(expPN))
{System.out.println("pass");}
else
{System.out.println("fail");}
}
public void ClickKiteHomePagePN()
{PN.click();}

}
