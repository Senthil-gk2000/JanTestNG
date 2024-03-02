package testng.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTwo {

	@Test
	public void fbLogin2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Arun");
		driver.findElement(By.id("pass")).sendKeys("arun123");
		Thread.sleep(3000);
		driver.close();
	}
}
