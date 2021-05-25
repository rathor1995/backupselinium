package POM_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1Page 
{
//step1: declare D.M.Globally
	@FindBy(xpath="//input[@id=\"userid\"] ")private WebElement UN ;
	@FindBy(xpath=" //input[@id=\"password\"]")private WebElement PWD ;
	@FindBy(xpath="//button[text()='Login '] ")private WebElement login;
	
	
	//Step2: to initialize global d.m.
	public kiteLogin1Page(WebDriver driver)
	{PageFactory.initElements(driver,this);}
	
	// step3 : 
	//enter UN 
	public void enterUN()
	{UN.sendKeys("DV1510");}
	//ENETER PWD
	public void enterPWD() 
	{PWD.sendKeys("Vijay@123");}
	
	public void clickOnLoginButton()
	{login.click();}
}
