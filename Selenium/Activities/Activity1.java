package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

		public static void main(String[] args) {
		    // Create a new instance of the Firefox driver
		    WebDriver driver = new FirefoxDriver();
		    
		    
		    // Open the browser
		    driver.get("https://training-support.net");
		    
		    String title=driver.getTitle();
		    System.out.println(title);
		    
		   

		    WebElement element = driver.findElement(By.linkText("About Us"));
		    if(element.getText()!=null)
		    element.click(); 
		    
		    String pagetitle=driver.getTitle();
		    System.out.println(pagetitle);
		    
		    driver.quit();
		  }
	}


