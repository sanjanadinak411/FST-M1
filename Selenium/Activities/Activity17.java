package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement dropdown = driver.findElement(By.xpath("(//select)[2]"));
        Select list = new Select(dropdown);
        
        list.selectByVisibleText("HTML");
        list.selectByIndex(4);
        list.selectByIndex(5);
        list.selectByIndex(6);
        
        list.selectByValue("nodejs");
        list.deselectByIndex(5);
        
        driver.quit(); 
        
}
}