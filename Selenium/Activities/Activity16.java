package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		   
        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement dropdown = driver.findElement(By.xpath("//select"));
        Select list = new Select(dropdown);
        list.selectByContainsVisibleText("Two");
        list.selectByIndex(2);
        list.selectByValue("four");
        
        List<WebElement> opt=list.getOptions();
        for (WebElement item: opt) {
        	 System.out.println(item.getText());
        }
       
        driver.quit(); 
          
}
}