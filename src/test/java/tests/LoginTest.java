package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.SignInLogIn;

public class LoginTest extends TestBase{

	HomePage homePageObject;
	LoginPage loginObject;
	SignInLogIn signInLogInObject;
	String email = "abdelrahmanelrayan@gmail.com";
	String password ="123456789";
	
	@Test
	public void loginProcess() throws InterruptedException {
		homePageObject = new HomePage(driver);
		homePageObject.openLogInPage();
		
		loginObject = new LoginPage(driver);
		loginObject.enterEmail(email);
		Thread.sleep(3000);
		loginObject.pressContinueBtn();
		
		signInLogInObject = new SignInLogIn(driver);
		signInLogInObject.completeLoginProcess(password);
		
		
	}
}
