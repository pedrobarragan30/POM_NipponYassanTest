package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait waitHomePage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		waitHomePage = new WebDriverWait(driver,15);
	}

	public void search(String searchTerm) {
		WebElement searchField = waitHomePage.until(ExpectedConditions.presenceOfElementLocated(By.id("search_query")));
		searchField.clear();
		searchField.sendKeys(searchTerm);
		
		WebElement searchButton = waitHomePage.until(ExpectedConditions.presenceOfElementLocated(By.id("search_button")));
		waitHomePage.until(ExpectedConditions.elementToBeClickable(By.id("search_button")));
		searchButton.click();		
	}
}
