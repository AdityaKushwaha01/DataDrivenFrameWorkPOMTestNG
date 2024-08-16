package qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homepage = new HomePageEvents();
	LoginPageEvents loginpage = new LoginPageEvents();
	
  @Test
  public void sampleMethodForEnteringCredentials() {
	  homepage.SignInButton();
	  loginpage.VerifyIfLoginPageIsLoaded();
	  loginpage.enterCredentials();
  }
}
