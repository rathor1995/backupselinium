package POM_PageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginpage1 
{
@FindBy(xpath="//input[@type=\"text\"]")private WebElement UN;
@FindBy(xpath = "//input[@type=\"password\"]")private WebElement PWD;
@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement LOGIN;


public kiteLoginpage1(WebDriver driver)
{PageFactory.initElements(driver, this);}


public void setkiteLoginpage1UserName()
{UN.sendKeys("DV1510");}
public void setkiteLoginpage1Password()
{PWD.sendKeys("Vijay@123");}
public void clickkiteLoginpage1LoginButton()
{LOGIN.click();}

}
