package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCategoryPage extends PageBase{

	public AllCategoryPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath="//*[@id=\"content-body\"]/div/div/div[2]/div/div[2]/div[10]/ul/li[3]/a")
	WebElement toysLink;

	public void openToysLink() throws InterruptedException {
		scrollToBottom();
		Thread.sleep(2000);
		clickButton(toysLink);
	}

}
