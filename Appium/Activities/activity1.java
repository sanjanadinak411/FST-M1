package Activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class activity1 {
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
		caps.setApp("C:/Users/SanjanaDinak/Downloads/Calculator.apk");
		caps.noReset();
		
		//appium server url
		URL serverurl=new URI("http://localhost:4723").toURL();
		
		//initialize android driver
		driver=new AndroidDriver(serverurl,caps);
		
	}
	@Test
	public void method() {
		
		driver.findElement(AppiumBy.id("digit_2")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.accessibilityId("3")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		String result=driver.findElement(AppiumBy.id("result_final")).getText();
		assertEquals(result,"6");
			
		
	}
	
	@AfterClass
	public void teardown() {
		//there is no driver.close here in mobile automation
		driver.quit();
	}
	
}
