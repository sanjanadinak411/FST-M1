package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		WebElement element_1 = driver.findElement(By.cssSelector("//img[@id='ball']"));
		WebElement element_2 = driver.findElement(By.cssSelector("//div[@id='dropzone1']"));
		
		builder.dragAndDrop(element_1,element_2);
	}

}
