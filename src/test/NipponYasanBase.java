package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pages.AuthenticationPage;
import pages.FiguresPage;
import pages.HistoryPage;
import pages.HomePage;
import pages.OrderPage;
import pages.SearchPage;

public class NipponYasanBase {
	protected WebDriver driver;
	protected HomePage nyHomePage;
	protected SearchPage nySearchPage;
	protected FiguresPage nyFiguresPage;
	protected AuthenticationPage nyAuthenticationPage;
	protected HistoryPage nyHistoryPage;
	protected OrderPage nyOrderPage;
	

	public void setUp(String browserToUse, String urlToOpen){
		switch(browserToUse) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("disable-infobars");
			options.addArguments("-disable-notifications");
			options.addArguments("--start-maximized");
			
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("BROWSER NOT SUPPORTED");
		}
		
		driver.get(urlToOpen);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		nyHomePage = new HomePage(driver);
		nySearchPage = new SearchPage(driver);
		nyFiguresPage = new FiguresPage(driver);
		nyAuthenticationPage = new AuthenticationPage(driver);
		nyHistoryPage = new HistoryPage(driver);
		nyOrderPage = new OrderPage(driver);
	}

	
	@After
	public void tearDown(){
		driver.quit();
	}

}
