package FreshMaven.FreshMaven;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class AppTest{
	
	public WebDriver driver;
	@Test
	public void someTest() throws InterruptedException{
		driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		System.out.println("WebOpened");
		
		driver.findElement(By.cssSelector(".fk-input.login-form-input.user-email")).sendKeys("swastiksuman@gmail.com");
		driver.findElement(By.cssSelector(".fk-input.login-form-input.user-pwd")).sendKeys("elnino");		
		driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();
		
	}
	
}