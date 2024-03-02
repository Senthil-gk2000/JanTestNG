package testng.parameters.dataprovider;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ParametersSample extends BaseClass{
	
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void testSetup(String browser, String url) {
		browserLaunch(browser, url);
	}
	
	@Parameters("search data")
	@Test
	public void searchJava(String data) {
		WebElement searchField = findElementByXpath("//*[@name='q']");
		searchField.sendKeys(data, Keys.ENTER);
	}
	
	@AfterMethod
	public void browserClose() {
		pageClose();
	}

}
