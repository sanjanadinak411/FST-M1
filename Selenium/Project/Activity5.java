package alchemyJobs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity5 extends BaseClass{

@Test
public void navigate() {
		
		WebElement menu = driver.findElement(By.xpath("//div[@class='main-navigation']//a[1]"));	
		menu.click();
		
		WebElement pageheading = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		assertEquals(pageheading.getText(), "Jobs");
		//driver.close();
				
	}
}