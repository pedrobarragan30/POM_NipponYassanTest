package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	WebDriver driver;
	WebDriverWait waitSearchPage;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		waitSearchPage = new WebDriverWait(driver,15);
	}

}
