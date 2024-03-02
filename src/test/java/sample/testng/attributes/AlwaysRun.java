package sample.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun {

	@Test(dependsOnMethods="sample3", alwaysRun=true)
	public void sample1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void sample2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void sample3() {
		Assert.assertTrue(false);
		System.out.println("Test 3");
	}
}
