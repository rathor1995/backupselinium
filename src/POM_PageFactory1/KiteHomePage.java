package POM_PageFactory1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement PN;
	
	
	public KiteHomePage(WebDriver driver)
	{PageFactory.initElements(driver, this);}
	
	public void verifyKiteHomePageProfileName()
	{String actPN = PN.getText();
	
	String expPN = "DV1510";
	if(actPN.equals(expPN))
	{System.out.println("pass");}
	else
	{System.out.println("fail");}
	}
}
