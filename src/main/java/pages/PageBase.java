package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	public Actions action;
	public JavascriptExecutor js;
	
	public PageBase (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	protected static void clickButton(WebElement button) {
		button.click();
	}
	
	protected static void setTxtElementTxt(WebElement txtElement, String value) {
		txtElement.sendKeys(value);
	}
	
	public void scrollToBottom() {
		js.executeScript("scrollBy(0,2600)");
	}
}
