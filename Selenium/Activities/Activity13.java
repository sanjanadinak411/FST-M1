package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	       
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("Page title: " + driver.getTitle());
        
        List<WebElement> columns = driver.findElements(By.xpath("//thead/tr/th"));
        System.out.println(columns.size());
      
        List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
        System.out.println(rows.size());

        
        List<WebElement> row_3 = driver.findElements(By.xpath("//tbody/tr[3]/td"));
        for(WebElement item : row_3){
        	System.out.println(item.getText());	
        }
        
        WebElement element_1 = driver.findElement(By.xpath("//tbody/tr/td[3]"));
        System.out.println(element_1.getText());
        
        driver.quit();
	}

}
