package testng.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestOne {

	@Test
	public void fbLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Vikas");
		driver.findElement(By.id("pass")).sendKeys("vikas123");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void searchProduct() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG LED TV", Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void searchJava() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Java", Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void searchSelenium() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenkum", Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
	}
}
