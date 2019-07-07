package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


import pages.ConfirmSignUp;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpTest extends TestBase{

	HomePage homeObject;
	LoginPage loginObject;
	SignUpPage signUpObject;
	ConfirmSignUp confirmSignUpObject;
	String name = "Abdelrahman El-Rayan";
	String email = "test@testmax1.test";
	String password = "123456789";
	
	
	@Test
	public void userSignUp() throws InterruptedException {
		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);
		signUpObject = new SignUpPage(driver);
		confirmSignUpObject = new ConfirmSignUp(driver);
		homeObject.openLogInPage();
		loginObject.pressSignUpBtn();
		signUpObject.signUp(name, email, password);
		assertEquals(confirmSignUpObject.verifyTxt.getText(), "Verify email address");
		
	}
}
