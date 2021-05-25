package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2Page 
{
@FindBy(xpath="//input[@id=\"pin\"]")private WebElement pin;
@FindBy(xpath="//button[@type=\"submit\"]")private WebElement cntBtn;

public kiteLogin2Page (WebDriver driver)
{PageFactory.initElements(driver, this);}

public void enterPin()
{pin.sendKeys("959594");}

public void clickOnCntButton()
{cntBtn.click();}
}
