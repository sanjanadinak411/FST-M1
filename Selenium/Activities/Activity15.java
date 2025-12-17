package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
	       
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page title: " + driver.getTitle());
        
        List<WebElement> inputs = driver.findElements(By.xpath("//input"));
        for (WebElement item: inputs){
        	if(item.getText()=="Full name") {
        		item.sendKeys("sandy");
        		
        	}
        	
        	else if(item.getText()=="Email address"){
        		item.sendKeys("san@test.co");
        	}
        
        	else {
        		item.sendKeys("04-11-1992");
        	}
        
        }
	
        WebElement text = driver.findElement(By.xpath("//textarea"));
        text.sendKeys("sany");
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
        //System.out.println(msg);
        
        driver.quit();  
        
}
}
