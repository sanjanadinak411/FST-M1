package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21 {
	static WebDriver driver = new FirefoxDriver();
	 static String parentHandle = driver.getWindowHandle();
   	 static Set<String> handles = driver.getWindowHandles();
 	static ArrayList<String> newlist = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
	 	
	   
	   	 
        driver.get("https://training-support.net/webelements/tabs");
        System.out.println("Page title: " + driver.getTitle());
        
       
        
        WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Open A New Tab')]"));
        button1.click();
        
        driver.switchTo().window(handles_method(0));
        
        WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'Open Another One')]"));
        button2.click();
        
        driver.switchTo().window(handles_method(1));
	
	}
	



        
        public static String handles_method(int num) {
        	
             
        	 try {
				for(String item:handles) {
				        if(item!=parentHandle) {
				        	newlist.add(item);
				        }
				        System.out.println(item);
				       
      }
			 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
        	 return newlist.get(num);
        }
        }
      
        
