package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());
	
        WebElement button1 = driver.findElement(By.xpath("(//button[@id='prompt'])"));
        button1.click();
        
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Awesome!");
        alert.accept();
        
        WebElement text = driver.findElement(By.xpath("//button[@id='result']"));
        System.out.println(text.getText());
        
        driver.quit(); 
	}

}
