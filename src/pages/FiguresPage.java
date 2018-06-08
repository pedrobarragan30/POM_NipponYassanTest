package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiguresPage {
	WebDriver driver;
	WebDriverWait waitFiguresPage;

	public FiguresPage(WebDriver driver) {
		this.driver = driver;
		waitFiguresPage = new WebDriverWait(driver,15);
	}

}
