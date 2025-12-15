package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    
	    
	    // Open the browser
	    driver.get("https://training-support.net/webelements/login-form/");
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    WebElement element_1 = driver.findElement(By.id("username"));
	    element_1.sendKeys("admin");
	    
	    WebElement element_2 = driver.findElement(By.id("password"));
	    element_2.sendKeys("password");
	    
	    WebElement element_3 = driver.findElement(By.xpath("//button[text()='Submit']"));
	    element_3.click();
	    
	    String title1=driver.getTitle();
	    System.out.println(title1);
	    
	}

}
