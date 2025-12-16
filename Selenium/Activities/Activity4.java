package selenium;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	    WebElement element_1 = driver.findElement(By.xpath("//h3"));
	    System.out.println(element_1.getText());
	    
	    WebElement element_2 = driver.findElement(By.xpath("//h5"));
	    String color=element_2.getCssValue("background-color");
	    System.out.println(color);
		
	    String element_3 = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
	    System.out.println(element_3);
	    
	    WebElement element_4 = driver.findElement(By.xpath("//button[contains(@class,'slate')]"));
	    System.out.println(element_4.getText());
	    
	    driver.quit();
	}

}
