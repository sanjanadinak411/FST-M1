package Activity7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	Object[][] data; 
    @BeforeClass
    public void setUp() {
      
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }
 
    @Test(dataProvider ="credentials")
    public void method1(String username, String password) {
    	
    	driver.getTitle();
    	
    	WebElement element_1 = driver.findElement(By.xpath("//input[@id='username']"));
	    element_1.sendKeys(username);
	    

	    WebElement element_2 = driver.findElement(By.xpath("//input[@id='password']"));
	    element_2.sendKeys(password);
	    
	    WebElement element_3 = driver.findElement(By.xpath("//button[text()='Submit']"));
	    element_3.click();
	    
	    Assert.assertEquals(driver.getTitle(), "Selenium: Login Success!");   
    }
   
    @DataProvider
    @Parameters({"username","password"})
    public Object[][] credentials(String username, String password) {
    	 return new Object[][] {
             { username, "username" },
             { password, "password" }
         };
    }
    @AfterClass
    public void tearDown() {
      
        driver.close();
    }
}
