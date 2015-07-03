package FreshMaven.FreshMaven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class AppTest{
	
	public WebDriver driver;
	@Test
	public void someTest() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		System.out.println("WebOpened");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
	
}