package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement PN;

	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	
	
	
	public String getKiteHomePage (WebDriver driver)
	{
		String ActPN = PN.getText();
		return ActPN;
		
	}
	
	public void clickKiteHomePagePn()
	{PN.click();}



	}

