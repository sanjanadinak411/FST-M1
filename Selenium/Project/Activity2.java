package alchemyJobs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity2 extends BaseClass{

@Test	
public void heading() {
		
		WebElement heading = driver.findElement(By.xpath("//h1[@class='entry-title']"));
		assertEquals(heading.getText(), "Welcome to Alchemy Jobs");
		driver.close();
		
	}
	
}
