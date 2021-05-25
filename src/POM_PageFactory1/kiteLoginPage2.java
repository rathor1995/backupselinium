package POM_PageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLoginPage2 {
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement PIN;
	@FindBy(xpath = "//button[@type=\"submit\"]")private WebElement CNT;
	
	public kiteLoginPage2(WebDriver driver)
	{PageFactory.initElements(driver, this);}
	
	public void setkiteLoginPage2PIN()
	{PIN.sendKeys("959594");}
	public void clickkiteLoginPage2()
	{CNT.click();}
}
