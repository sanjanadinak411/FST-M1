package project1;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class activity1 extends Base{
	
	@Test(priority=0)
	public void method1() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.app.todolist:id/fab_new_task"))).click();
		driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).click();
		driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_name")).sendKeys("Activity 1");
		driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_description")).sendKeys("Complete Activity 1 with priority high");
		driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();
		result();
	}
	
	@Test(priority=1)
	public void method2() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.app.todolist:id/fab_new_task"))).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.app.todolist:id/et_new_task_name']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.app.todolist:id/et_new_task_name']")).sendKeys("Activity 2");
		driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_description")).sendKeys("Complete Activity 2 with priority medium");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_new_task_priority']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Medium']"))).click();
		driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();	
		result();
		
	}
	@Test(priority=2)
	public void method3() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.app.todolist:id/fab_new_task"))).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.app.todolist:id/et_new_task_name']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='com.app.todolist:id/et_new_task_name']")).sendKeys("Activity 3");
		driver.findElement(AppiumBy.id("com.app.todolist:id/et_new_task_description")).sendKeys("Complete Activity 3 with priority low");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_new_task_priority']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Low']"))).click();
		driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();	
		result();
	}
	
}