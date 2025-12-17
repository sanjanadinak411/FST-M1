package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());
	
        WebElement button1 = driver.findElement(By.xpath("(//button[@id='simple'])"));
        button1.click();
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
        
        driver.quit(); 
	}

}
