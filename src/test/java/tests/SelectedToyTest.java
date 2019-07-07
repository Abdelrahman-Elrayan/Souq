package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AllCategoryPage;
import pages.HomePage;
import pages.SelectedToyPage;
import pages.ToysPage;

public class SelectedToyTest extends TestBase{

	HomePage homeObject;
	AllCategoryPage allCategoryObject;
	ToysPage toysObject;
	SelectedToyPage selectedToyObject;

	@Test
	public void selectToy() throws InterruptedException {
		homeObject = new HomePage(driver);
		homeObject.openAllCategory();
		Thread.sleep(1000);
		
		allCategoryObject = new AllCategoryPage(driver);
		allCategoryObject.openToysLink();
		
		toysObject = new ToysPage(driver);
		toysObject.openSelectedToy();
		
		try {
		
			assertTrue(selectedToyObject.toyTitle.getText().contains("Doll stroller"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		

		
	}
}
