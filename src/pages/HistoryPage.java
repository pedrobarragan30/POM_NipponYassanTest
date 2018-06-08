package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HistoryPage {
	WebDriver driver;
	WebDriverWait waitHistoryPage;

	public HistoryPage(WebDriver driver) {
		this.driver = driver;
		waitHistoryPage = new WebDriverWait(driver,15);		
	}

}
