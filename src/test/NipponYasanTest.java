package test;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class NipponYasanTest extends NipponYasanBase{
	
	@Test
	@FileParameters("./data/dtNipponYasan.csv")
	public void testNipponYasan(String browserToUse, String urlToOpen, String searchTerm) {
		
		setUp(browserToUse,urlToOpen);
		
		nyHomePage.search(searchTerm);
	}

}
