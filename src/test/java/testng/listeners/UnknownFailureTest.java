package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailureTest {

	@Test
	public void unknownFail() {
		System.out.println("Unknown failure Test");
		Assert.assertTrue(false);
	}
}
