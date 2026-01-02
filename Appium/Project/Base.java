package project2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base {
	AppiumDriver driver;
	WebDriverWait wait;

	
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		//desired capabilities
		UiAutomator2Options caps=new UiAutomator2Options();
		caps.setPlatformName("Android");
		caps.setAutomationName("UiAutomator2");
		caps.setAppPackage("com.android.chrome");
		caps.setAppActivity("com.google.android.apps.chrome.Main");
		//caps.setApp("https://training-support.net");
		
		caps.setCapability("appium:settings[enableMultiWindows]", true);
		caps.noReset();
		//appium server url
		URL serverurl=new URI("http://localhost:4723").toURL();
		
		//initialize web driver
		 driver = new AndroidDriver(serverurl, caps);
		 //driver.setSetting("enableMultiWindows", true);
		 driver.get("https://training-support.net/webelements");
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		
	}
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
}
