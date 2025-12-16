package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/webelements/mouse-events");
		    
		    String title=driver.getTitle();
		    System.out.println(title);
		    
		    Actions builder = new Actions(driver);
		    
		    
		    WebElement element_1 = driver.findElement(By.linkText("Cargo.lock"));
		    WebElement element_2 = driver.findElement(By.linkText("Cargo.toml"));
		    
		    builder.dragAndDrop(element_1, element_2).perform();
		    
		    WebElement element_3 = driver.findElement(By.linkText("src"));
		    builder.doubleClick(element_3);
		    
		    WebElement element_4 = driver.findElement(By.linkText("target"));
		    builder.contextClick(element_4).build().perform();
		    builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
		    
		    String actionMessage = driver.findElement(By.id("result")).getText();
	        System.out.println(actionMessage);
	        
	        driver.quit();
	}

}
