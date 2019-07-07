package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="auth-portal-register")
	WebElement createAccountBtn;
	
	@FindBy(id="email")
	WebElement emailLogInBox;
	
	@FindBy(css="span.auth-create-account-link.a-button-primary")
	WebElement siteLoginBtn;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	
	public void pressSignUpBtn() {
		clickButton(createAccountBtn);
	}
	
	public void enterEmail(String email) {
		setTxtElementTxt(emailLogInBox, email);
		clickButton(siteLoginBtn);
	}
	
	public  void pressContinueBtn() {
		clickButton(continueBtn);
	}
}
