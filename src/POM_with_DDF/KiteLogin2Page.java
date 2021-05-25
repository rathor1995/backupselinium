package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
@FindBy(xpath="//input[@id=\"pin\"]")private WebElement PIN;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement CNTBTN;


public KiteLogin2Page(WebDriver driver)
{PageFactory.initElements(driver, this);}

public void setKiteLogin2PagePIN (String PINout)
{PIN.sendKeys(PINout);}
public  void clickKiteLogin2PageCntBtn()
{CNTBTN.click();}
}
