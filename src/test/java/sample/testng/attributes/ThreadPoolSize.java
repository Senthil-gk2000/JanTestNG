package sample.testng.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.utils.BaseClass;

public class ThreadPoolSize extends BaseClass{

	@Test(invocationCount=7, threadPoolSize = 3)
	public void test1() throws InterruptedException {
		
		System.out.println("Thread ID : "+Thread.currentThread().getId());
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Java", Keys.ENTER);
		driver.close();
		
//		browserLaunch("chrome", "https://www.google.com/");
//		findElementByXpath("//*[@name='q']").sendKeys("Java", Keys.ENTER);
//		pageClose();
//		Thread.sleep(3000);
	}
}
