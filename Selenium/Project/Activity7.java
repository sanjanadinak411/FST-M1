package alchemyJobs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));


@BeforeClass
public void setup() {
	
	driver = new ChromeDriver();
    driver.get("https://alchemy.hguy.co/jobs");
	
}

@Test
public void create_job() {
		
		
		WebElement postjob =driver.findElement(By.xpath("(//a)[5]"));
		postjob.click();
		
		WebElement youremail =driver.findElement(By.xpath("//input[@id='create_account_email']"));
		youremail.sendKeys("san@test.com");
		
		WebElement jobtitle =driver.findElement(By.xpath("//input[@id='job_title']"));
		jobtitle.sendKeys("tester");
		
		WebElement select_dropdown =driver.findElement(By.xpath("//select[@id='job_type']"));
		Select dropdown = new Select(select_dropdown);
		dropdown.selectByVisibleText("Freelance");
		
		
		wait.until(dummy_name -> driver.switchTo().frame("job_description_ifr"));
		driver.findElement(By.id("tinymce")).sendKeys("Dummy job description");
		driver.switchTo().defaultContent();
		
		
		
		WebElement app_email =driver.findElement(By.xpath("//input[@id='application']"));
		app_email.sendKeys("san@test.com");
		
		WebElement company_name =driver.findElement(By.xpath("//input[@id='company_name']"));
		company_name.sendKeys("Ibm");
		
		WebElement preview =driver.findElement(By.xpath("//input[@name='submit_job']"));
		preview.click();
		
		
		WebElement submit_button=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='job_preview_submit_button']"))));
		submit_button.click();
		
		WebElement content =driver.findElement(By.xpath("//div[@class='entry-content clear']"));
		String validate=content.getText();
		assertEquals(validate.contains("successfully"),"successfully");
		
		WebElement menu = driver.findElement(By.xpath("//div[@class='main-navigation']//a[1]"));	
		menu.click();
		List<WebElement> listing = driver.findElements(By.xpath("//ul[@class='job_listings']//div[@class='position']"));
		for(WebElement item:listing) {
			if(item.getText().contains("test")) {
				System.out.println("job is posted successfully");
			}
			else {
				System.out.println("job is not posted");
			}
		}
		driver.close();
	}
}