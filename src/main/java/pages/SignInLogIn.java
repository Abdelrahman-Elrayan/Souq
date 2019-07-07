package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLogIn extends PageBase{

	public SignInLogIn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="ap_password")
	WebElement passwordSignInBox;
	
	@FindBy(id="signInSubmit")
	WebElement continueSignInBtn;
	
	@FindBy(id="auth-fpp-link-bottom")
	WebElement forgetPasswordLink;
	
	public void completeLoginProcess(String password) {
		setTxtElementTxt(passwordSignInBox, password);
		clickButton(continueSignInBtn);
	}
	
	public void pressForgetPasswordLink() {
		clickButton(forgetPasswordLink);
	}

}
