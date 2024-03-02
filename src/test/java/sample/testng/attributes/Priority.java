package sample.testng.attributes;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=5)
	public void tests() {
		System.out.println("Test 5");
	}
	
	//If we didn't declare any priority then, by default it will take 0th 
	//priority for execution 
	
	//If two @Test had same priority then, it will follow the alphabetical order
	//If we didn't declare any priority 2 @Test, that time also it will follow the alphabetical order
	
	//Can we declare negative values in the priority? yes
	@Test
	public void testk() {
		System.out.println("Test 6");
	}
	
	@Test(priority=5)
	public void testi() {
		System.out.println("Test 7");
	}
	
	@Test(priority=-1)
	public void testsz() {
		System.out.println("Test 8");
	}
	
	@Test(priority=-3)
	public void testab() {
		System.out.println("Test 9");
	}
	
	@Test(priority=4)
	public void testsr() {
		System.out.println("Test 4");
	}
	
	@Test(priority=2)
	public void testsa() {
		System.out.println("Test 2");
	}
	
	@Test(priority=1)
	public void testsf() {
		System.out.println("Test 1");
	}
	
	@Test(priority=3)
	public void testsy() {
		System.out.println("Test 3");
	}
}
