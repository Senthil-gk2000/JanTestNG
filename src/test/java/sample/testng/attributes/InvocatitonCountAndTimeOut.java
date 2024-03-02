package sample.testng.attributes;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class InvocatitonCountAndTimeOut extends BaseClass{

	@Test(invocationCount=3, invocationTimeOut=15000)
	public void test1() {
		browserLaunch("chrome", "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("Java", Keys.ENTER);
		pageClose();
	}
}
