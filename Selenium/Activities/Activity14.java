package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	       
        driver.get("https://training-support.net/webelements/tables");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement row_5 = driver.findElement(By.xpath("//tbody/tr[5]/td[2]"));
        System.out.println(row_5.getText());
        
        WebElement price = driver.findElement(By.xpath("//th[text()='Price']"));
        price.click();
        
        //driver.quit();
}
}