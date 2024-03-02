package sample.testng.attributes;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class TimeOut extends BaseClass{

	@Test(timeOut=7000)
	public void searchJava() {
		browserLaunch("chrome", "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("Java", Keys.ENTER);
		pageClose();
	}
}
