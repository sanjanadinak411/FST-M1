package selenium_TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

		WebDriver driver;
		
		@BeforeClass
		public void setup() {
			driver = new FirefoxDriver();
			driver.get("https://training-support.net/webelements/target-practice/");
		}
		
		@Test
		public void method1() {
			assertEquals(driver.getTitle(),"Selenium: Target Practice");
		}
		@Test
		public void method2() {
			
			Assert.assertTrue(driver.findElement(By.xpath("//a[text()='black']")).isDisplayed());
			
		}
		
		@Test(enabled=false)
		public void method3() {
			assertEquals(driver.getTitle(),"Training Support");
			driver.findElement(By.xpath("//a[text()='About Us']")).click();
			System.out.println(driver.getTitle());
		}
		
		@Test
		public void method4() throws SkipException{
			assertEquals(driver.getTitle(),"Training Support");
			driver.findElement(By.xpath("//a[text()='About Us']")).click();
			System.out.println(driver.getTitle());
		}
		
		
		@AfterClass
		public void close_browser() {
			driver.quit();
		}
		
	}


