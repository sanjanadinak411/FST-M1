package alchemyJobs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Activity6 extends BaseClass{

@Test
public void search() {
		
		WebElement menu = driver.findElement(By.xpath("//div[@class='main-navigation']//a[1]"));	
		menu.click();
	
		WebElement search = driver.findElement(By.xpath("//input[@id='search_keywords']"));		
		search.sendKeys("testing");
		
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='job_listings']")));
		
		WebElement entry=driver.findElement(By.xpath("//ul[@class='job_listings']//a"));
		entry.click();
		
		
		WebElement apply =driver.findElement(By.xpath("//input[@value='Apply for job']"));
		apply.click();
		
		WebElement site =driver.findElement(By.xpath("//div[@class='application_details']//a"));
		System.out.println(site.getText());
		
	}
}