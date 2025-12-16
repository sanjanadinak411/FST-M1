package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new FirefoxDriver();
			driver.get("https://training-support.net/webelements/dynamic-controls");
		    
		    String title=driver.getTitle();
		    System.out.println(title);
		    
		    WebElement element_1 = driver.findElement(By.cssSelector("input[type='checkbox']"));
		    System.out.println(element_1.isDisplayed());
		    
		    element_1.click();
		    System.out.println(element_1.isDisplayed());
		    
		    driver.quit();
		    
	}

}
