package alchemyJobs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8{
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	
	@BeforeClass
	public void setup() {
		
		driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
	}
	
	@Test
	public void title() {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
		username.sendKeys("root");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		password.sendKeys("pa$$w0rd");

		WebElement login = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		login.click();
		
		WebElement after_login = driver.findElement(By.xpath("(//a[@class='ab-item']//span[@class='display-name'])[1]"));
		assertEquals(after_login.getText(),"root");
		
		//driver.close();
		
	}
	
	@Test(dependsOnMethods = {"title"})
	public void publish() {
		
			WebElement job_link = driver.findElement(By.xpath("//div[@class='wp-menu-name'][text()='Job Listings']"));
			job_link.click();
			
			wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement add_new = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Add New'][@class='page-title-action']"))));
			add_new.click();
			
			WebElement popup = driver.findElement(By.xpath("(//button[@class='components-button has-icon'])[5]"));
			popup.click();
			
			WebElement post_title = driver.findElement(By.xpath("//textarea[@id='post-title-0']"));
			post_title.sendKeys("tester");
			
			WebElement app_id = driver.findElement(By.xpath("//input[@name='_application']"));
			app_id.clear();
			app_id.sendKeys("San@test.com");
			
			WebElement website = driver.findElement(By.xpath("//input[@name='_company_website']"));
			website.sendKeys("website of company");
			
			
			WebElement twitter = driver.findElement(By.xpath("//input[@name='_company_twitter']"));
			twitter.sendKeys("twitter");
			
			WebElement expiry = driver.findElement(By.xpath("//input[@name='_job_expires-datepicker']"));
			expiry.sendKeys("December 24,2025");
			
			
			WebElement location = driver.findElement(By.xpath("//input[@name='_job_location']"));
			location.sendKeys("London");
			
			WebElement com_name = driver.findElement(By.xpath("//input[@name='_company_name']"));
			com_name.sendKeys("ibm");
			
			WebElement tagline = driver.findElement(By.xpath("//input[@name='_company_tagline']"));
			tagline.sendKeys("tagline");
			
			WebElement publish = driver.findElement(By.xpath("//button[text()='Publish…']"));
			publish.click();
			
			WebElement publish_2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='Publish']"))));
			actions=new Actions(driver);
			actions.moveToElement(publish_2).click().build().perform();
			//publish.click();
			
			WebElement view_job = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='components-button is-secondary'][text()='View Job']"))));
			//actions=new Actions(driver);
			//actions.moveToElement(view_job).click().build().perform();
			view_job.click();
			
			WebElement apply_job = driver.findElement(By.xpath("//input[@value='Apply for job']"));
			assertEquals(apply_job.getText().toString(),"Apply for job");
			
		}
}
	
	

