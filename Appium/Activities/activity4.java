package Activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class activity4 {

		AppiumDriver driver;
		WebDriverWait wait;
		
		@BeforeClass
		public void setup() throws MalformedURLException, URISyntaxException {
			//desired capabilities
			UiAutomator2Options caps=new UiAutomator2Options();
			caps.setPlatformName("Android");
			caps.setAutomationName("UiAutomator2");
			//File appfile=new File("");
			//caps.setApp(appfile.getAbsolutePath());
			caps.setAppPackage("com.google.android.contacts");
			caps.setAppActivity("com.android.contacts.activities.PeopleActivity");
			caps.noReset();
			
			//appium server url
			URL serverurl=new URI("http://localhost:4723").toURL();
			
			//initialize android driver
			driver=new AndroidDriver(serverurl,caps);
		}	
		
		@Test
		public void method4() {
			
			driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Aaditya");
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("varma");
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='+1']")).sendKeys("999148292");
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='Save']"))).click();
		}
		
		@AfterClass
		public void teardown() {
			//there is no driver.close here in mobile automation
			driver.quit();
		}
}
		