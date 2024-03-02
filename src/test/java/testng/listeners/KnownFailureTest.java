package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailureTest {

	@Test(retryAnalyzer = RetryClass.class)
	public void knownFail() {
		System.out.println("Known failure test");
		Assert.assertTrue(false);
	}
}
