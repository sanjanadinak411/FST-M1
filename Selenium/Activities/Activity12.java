package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
	public static void main(String[] args) {
       
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://www.training-support.net/webelements/dynamic-content");
        System.out.println("Page title: " + driver.getTitle());

        WebElement element_1 = driver.findElement(By.id("genButton"));
        element_1.click();
        
        WebElement element_2 = driver.findElement(By.id("word"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.textToBePresentInElement(element_2,"release"));
        
        if(element_2.isDisplayed()) {
        	System.out.println(element_2.getText());
        }
        
        driver.quit();
    }
}
