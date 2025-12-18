package selenium_TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
	}
	
	@Test
	public void method1() {
		WebElement element_1 = driver.findElement(By.xpath("//input[@id='username']"));
	    element_1.sendKeys("admin");
	    

	    WebElement element_2 = driver.findElement(By.xpath("//input[@id='password']"));
	    element_2.sendKeys("password");
	    
	    WebElement element_3 = driver.findElement(By.xpath("//button[text()='Submit']"));
	    element_3.click();
	    
	    Assert.assertEquals(driver.getTitle(), "login-success");
	}

	@AfterClass
	public void close_browser() {
		driver.quit();
	}
	

}
