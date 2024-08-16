package pageEvents;


import org.testng.*;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {

	ElementFetch ele = new ElementFetch();
	public void VerifyIfLoginPageIsLoaded()
	{
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.LoginText).size()>0,"Element Not found");
	}
	public void enterCredentials()
	{
		ele.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("akushwaha@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("12345");
	}
	
}
