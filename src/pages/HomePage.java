package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait waitHomePage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waitHomePage = new WebDriverWait(driver,15);
	}

}
