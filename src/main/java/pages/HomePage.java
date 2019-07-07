package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="userNameField_topbar")
	WebElement logInBtn;
	
	@FindBy(linkText="All Categories")
	WebElement allCategoryLink;
	
	public void openLogInPage() {
		clickButton(logInBtn);
	}
	
	public void openAllCategory() {
		clickButton(allCategoryLink);
	}
}
