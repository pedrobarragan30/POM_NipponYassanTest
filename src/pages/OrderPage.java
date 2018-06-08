package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {
	WebDriver driver;
	WebDriverWait waitOrderPage;

	public OrderPage(WebDriver driver) {
		this.driver = driver;
		waitOrderPage = new WebDriverWait(driver,15);
	}

}
