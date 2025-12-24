package Activities;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.android.options.UiAutomator2Options;

public class activity5 {

	AppiumDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		//desired capabilities
		UiAutomator2Options caps=new UiAutomator2Options();
		caps.setPlatformName("Android");
		caps.setAutomationName("UiAutomator2");
		caps.setAppPackage("com.google.android.apps.messaging");
		caps.setAppActivity(".ui.ConversationListActivity");
		//caps.setApp("https://training-support.net");
		caps.noReset();
		
		//appium server url
		URL serverurl=new URI("http://localhost:4723").toURL();
		
		//initialize web driver
		 driver = new AndroidDriver(serverurl, caps);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	@Test
	public void method1() {
		
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='Start chat']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='ContactSearchField']")).sendKeys("18282832912");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		WebElement text_msg=wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.apps.messaging:id/compose_message_text")));
		text_msg.sendKeys("Hello appium hey");
		wait.until(ExpectedConditions.textToBePresentInElement(text_msg,"appium"));
		driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='Compose:Draft:Send']/android.widget.Button")).click();
		
		String Text = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Hello')]")).getText();
		assertTrue(Text.contains("appium"));
}
}
