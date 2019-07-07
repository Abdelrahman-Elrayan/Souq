package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageBase{

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="ap_customer_name")
	WebElement nameTxtBox;
	
	@FindBy(id="ap_email")
	WebElement emailTxtBox;
	
	@FindBy(id="ap_password")
	WebElement passwordTxtBox;
	
	@FindBy(id="ap_password_check")
	WebElement confirmPasswordTxtBox;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	public void signUp(String name, String email, String password) {
		setTxtElementTxt(nameTxtBox, name);
		setTxtElementTxt(emailTxtBox, email);
		setTxtElementTxt(passwordTxtBox, password);
		setTxtElementTxt(confirmPasswordTxtBox, password);
		clickButton(continueBtn);
	}
}
