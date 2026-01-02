package project2;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class activity1 extends Base{
	
	@Test(priority=0)
	public void method1() {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollIntoView(new UiSelector().textContains(\"To-Do List\"))"+".scrollToEnd(100,3)")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='todo-input']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='todo-input']")).sendKeys("Add tasks to list");
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@resource-id='todo-add']"))).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='todo-input']")).sendKeys("Get number of tasks");
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@resource-id='todo-add']"))).click();
	
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='todo-input']")).sendKeys("Clear the list");
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@resource-id='todo-add']"))).click();
	
		List<WebElement> count=driver.findElements(AppiumBy.className("android.widget.CheckBox"));
		for(WebElement item:count) {
			item.click();
		}
		
		System.out.println(count.size());
		Assert.assertEquals(count.size(),5);
	}

}
