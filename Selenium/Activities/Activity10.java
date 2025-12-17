package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println(driver.getTitle());
		
		Actions builder = new Actions(driver);
		
		WebElement element_1 = driver.findElement(By.cssSelector("img#ball"));
		WebElement element_2 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement element_zone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
		
		builder.dragAndDrop(element_1,element_2).perform();
		
		WebElement element_3 = driver.findElement(By.xpath("//div[@id='dropzone1']/span[text()='Dropped!']"));
		
		
		if(element_3.isDisplayed()) {
			System.out.println("The ball is in dropzone1 now");
			builder.dragAndDrop(element_1,element_zone2).perform();
			Thread.sleep(3000);
			
			WebElement element_4 = driver.findElement(By.xpath("//div[@id='dropzone2']/span[text()='Dropped!']"));
			if(element_4.isDisplayed()) {
				System.out.println("The ball is in dropzone2 now");
			}
		}
		else {
			System.out.println("The ball is not dropped into the targets");
		}
		
		driver.quit();
	}
	
}
