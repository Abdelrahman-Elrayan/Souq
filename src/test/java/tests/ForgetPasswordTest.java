package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SignInLogIn;

public class ForgetPasswordTest extends TestBase{

	HomePage homePageObject;
	LoginPage loginObject;
	SignInLogIn signInLogInObject;
	String email = "abdelrahmanelrayan@gmail.com";
	
	@Test
	public void forgetPassword() throws InterruptedException {
		homePageObject = new HomePage(driver);
		homePageObject.openLogInPage();
		
		loginObject = new LoginPage(driver);
		loginObject.enterEmail(email);
		Thread.sleep(3000);
		loginObject.pressContinueBtn();
		
		signInLogInObject = new SignInLogIn(driver);
		signInLogInObject.pressForgetPasswordLink();
		Thread.sleep(3000);
		loginObject.pressContinueBtn();
		
	}

}
