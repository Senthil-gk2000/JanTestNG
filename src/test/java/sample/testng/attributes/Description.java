package sample.testng.attributes;

import org.testng.annotations.Test;

public class Description {

	@Test(description="Sample test for description attribute")
	public void sample() {
		System.out.println("Test 1 for Description");
	}
}
