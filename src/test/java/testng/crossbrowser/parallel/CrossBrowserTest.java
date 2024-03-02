package testng.crossbrowser.parallel;

import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class CrossBrowserTest extends BaseClass{

	@Parameters("browser")
	@Test
	public void searchJava(String browser) throws InterruptedException {
		browserLaunch(browser, "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("TestNG", Keys.ENTER);
		Thread.sleep(3000);
		pageClose();
	}
}
