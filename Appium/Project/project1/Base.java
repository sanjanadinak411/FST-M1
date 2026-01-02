package project1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import static java.time.Duration.ofMillis;

import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;


import java.util.Arrays;


import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;

import org.openqa.selenium.interactions.PointerInput.Kind;

import org.openqa.selenium.interactions.PointerInput.MouseButton;
import org.openqa.selenium.interactions.Sequence;


import io.appium.java_client.AppiumDriver;


public class Base {
	
	//set the pointer type
	 final static PointerInput finger= new PointerInput(Kind.TOUCH, "dummy_name");

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
		caps.setApp("C:/Users/SanjanaDinak/Downloads/ts-todo-list-v1.apk");
		caps.setAppPackage("com.app.todolist"); 
		caps.setAppActivity(".view.MainActivity");
		caps.noReset();
		
		//appium server url
		URL serverurl=new URI("http://localhost:4723").toURL();
		
		//initialize android driver
		driver=new AndroidDriver(serverurl,caps);
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
	}
	
		
		//create function to swipe
		public static void press(AppiumDriver driver,Point start,int duration) {
			
			
			
			Sequence long_press=new Sequence(finger, 1);//here 1 is min no of actions
			
			long_press.addAction(finger.createPointerMove(ofMillis(0),viewport(),start.getX(),start.getY()));//view port is the area where the touch actions is taking place
			long_press.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));    //0=LEFT CLICK
			long_press.addAction(new Pause(finger, ofMillis(4000)));
			long_press.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));//0=LEFT CLICK
			
			//perform sequence
			driver.perform(Arrays.asList(long_press));
			
		}
	
		public static void doSwipe(AppiumDriver driver,Point start, Point end,int duration) {
			
			
			
			Sequence swipe=new Sequence(finger, 1);//here 1 is min no of actions
			
			swipe.addAction(finger.createPointerMove(ofMillis(0),viewport(),start.getX(),start.getY()));//view port is the area where the touch actions is taking place
			swipe.addAction(finger.createPointerDown(MouseButton.LEFT.asArg()));    //0=LEFT CLICK
			swipe.addAction(new Pause(finger, ofMillis(4000)));
			swipe.addAction(finger.createPointerMove(ofMillis(duration), viewport(),end.getX(),end.getY()));
			swipe.addAction(finger.createPointerUp(MouseButton.LEFT.asArg()));//0=LEFT CLICK
			
			//perform sequence
			driver.perform(Arrays.asList(swipe));
			
		}
		
		public void result() {
			List<WebElement> result=driver.findElements(AppiumBy.id("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_exlv_task_name' and @text='task']"));
			
			for (WebElement item:result){
				
				String text=item.getText();
				if(text=="Activity 1"||text=="Activity 2"||text=="Activity 3") {
					System.out.println("The task " +text+ " is added successfully");
				}	
			}
		}
		
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	}

	

