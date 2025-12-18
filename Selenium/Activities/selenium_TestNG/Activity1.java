package selenium_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	public void method1() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
	@Test
	public void open_browser() {
		assertEquals(driver.getTitle(),"Training Support");
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		System.out.println(driver.getTitle());
	}
	
	@AfterClass
	public void close_browser() {
		driver.quit();
	}
	
}
