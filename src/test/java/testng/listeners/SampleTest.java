package testng.listeners;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class SampleTest extends BaseClass{

	@Test
	public void sample() {
		System.out.println("Sample Test for Listener");
	}
	
	@Test
	public void failSample() {
		System.out.println("Sample Fail Test for Listener");
		Assert.assertTrue(false);
	}
	
	@Test
	public void searchJava() {
		browserLaunch("chrome", "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("Java", Keys.ENTER);
		pageClose();
	}
	
	@Test
	public void skipSample() {
		System.out.println("Sample Skip Test for Listener");
		throw new SkipException("Sample Skip Test for Listener");
	}
}
