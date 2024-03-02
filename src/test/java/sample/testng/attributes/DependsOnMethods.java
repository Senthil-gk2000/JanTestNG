package sample.testng.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void addToCart() {
		System.out.println("Product added into the Cart");
	}
	
	@Test(dependsOnMethods = "sample.testng.attributes.Enabled.sample1")
	public void login() {
//		Assert.assertTrue(false);
		System.out.println("User logged in");
	}
	
	//can we use different class methods in dependsOnMethods?
	  // yes, we can use it by following the syntax
	  // packagename.ClassName.methodName
	
	@Test(dependsOnMethods = "login")
	public void checkout() {
		System.out.println("Checkout the Product");
	}
}
