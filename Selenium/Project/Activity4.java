package alchemyJobs;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity4 extends BaseClass{

@Test
public void secondheading() {
		
		WebElement heading2 = driver.findElement(By.xpath("//h2"));
		assertEquals(heading2.getText(), "Quia quis non");
		driver.close();
		
	}
}