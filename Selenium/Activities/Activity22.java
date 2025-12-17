package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("https://training-support.net/webelements/popups");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement button1 = driver.findElement(By.xpath("//button[@id='launcher']"));
        button1.click();
        
        WebElement user = driver.findElement(By.xpath("//button[@id='username']"));
        user.sendKeys("admin");
        
        WebElement pass = driver.findElement(By.xpath("//button[@id='password']"));
        user.sendKeys("password"); 
        
        WebElement button = driver.findElement(By.xpath("//button[@id='Submit']"));
        button.click();
        
        System.out.println("Page title: " + driver.getTitle());
        
        driver.quit(); 
        
	}

}
