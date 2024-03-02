package testng.parameters.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample{
	
	//@Test(dataProvider="credentials") -> Same class
	@Test(dataProvider="sample", dataProviderClass=DiffClass.class)
	public void loginWithDiffComboOfCredentials(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		Thread.sleep(5000);
		driver.close();
	}
	
	//Can we give name for the dataprovider
	//Explain about dataprovider attributes?
	//Difference between Parameters Vs DataProvider
    //Can we use different class dataprovider
	//What is dataProvider & dataProviderClass?
	
	@DataProvider(name="credentials", parallel=true)
	public Object[][] testData() {
		return new Object[][] {{"Muthu173", "Test@123"},
			    			   {"Muthu173", "Testing"},
			    			   {"Muthu", "Test@123"},
			    			   {"Muthu", "Testing"}};
	}
}
