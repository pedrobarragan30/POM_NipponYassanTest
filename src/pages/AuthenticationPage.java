package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {
	WebDriver driver;
	WebDriverWait waitAuthenticationPage;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		waitAuthenticationPage = new WebDriverWait(driver,15);
	}

}
