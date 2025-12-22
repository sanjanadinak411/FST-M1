package alchemyJobs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
WebDriver driver;
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
	
@BeforeClass
public void setup() {
		
		driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
		
	}
}