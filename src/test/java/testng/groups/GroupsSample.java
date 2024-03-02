package testng.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups={"Smoke", "Regression", "LoginPage"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups={"Smoke", "Regression"})
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups={"Smoke", "Regression"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups={"Sanity", "Regression"})
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test(groups={"Sanity", "Regression"})
	public void test5() {
		System.out.println("Test 5");
	}
	
	@Test(groups={"HomePage", "Regression"})
	public void test6() {
		System.out.println("Test 6");
	}
	
	@Test(groups={"CartPage", "Regression"})
	public void test7() {
		System.out.println("Test 7");
	}
	
	@Test(groups={"PDPPage", "Regression"})
	public void test8() {
		System.out.println("Test 8");
	}
	
	@Test(groups={"HomePage", "Regression"})
	public void test9() {
		System.out.println("Test 9");
	}
}
