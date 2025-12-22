package alchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Activity3 extends BaseClass{

@Test
public void printurl() {
		
		WebElement url = driver.findElement(By.xpath("//img"));
		System.out.println(url.getDomAttribute("src"));
		driver.close();
		
	}
}