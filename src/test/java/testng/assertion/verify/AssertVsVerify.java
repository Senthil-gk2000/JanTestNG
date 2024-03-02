package testng.assertion.verify;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	@Test
	public void hardAssertion() {
		String name = "Aarthi";
		String name1 = "aarthi";
		Assert.assertEquals(name, name1);
	}
	
	@Test
	public void softAssertion() {
		SoftAssert verify = new SoftAssert();
		String name = "Aarthi";
		String name1 = "aarthi";
		verify.assertEquals(name, name1);
	}
}
