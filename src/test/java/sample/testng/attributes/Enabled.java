package sample.testng.attributes;

import org.testng.annotations.Test;

public class Enabled {

	//What are the different ways to ignore the tc's? -> enabled=false
	
	@Test(groups="Smoke")
	public void sample1() {
		System.out.println("Enabled Test 1");
	}
	
	@Test(enabled=false)
	public void sample2() {
		System.out.println("Test 2");
	}
}
