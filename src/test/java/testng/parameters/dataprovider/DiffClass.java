package testng.parameters.dataprovider;

import org.testng.annotations.DataProvider;

public class DiffClass {

	@DataProvider
	public Object[][] sample(){
		return new Object[][] {{"Roselin", "rose123"}, 
							   {"Raj", "raj123"}};
	}
}
