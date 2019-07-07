package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToysPage extends PageBase{

	public ToysPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"content-body\"]/div[6]/div/div[1]/div/div[2]/ul/li[1]/h6/a")
	WebElement colorTents;
	
	public void openSelectedToy() {
		clickButton(colorTents);
	}
}
