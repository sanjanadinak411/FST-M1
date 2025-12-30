package project1;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;

public class activity2 extends Base{

	
	@Test(priority=3)
	public void method4() {
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_exlv_task_name' and @text='Activity 2']")));
		
		Dimension dim=driver.manage().window().getSize();
		
		int StartX=(int) (0.26f* dim.getWidth());
		int StartY=(int) (0.17f* dim.getHeight());
		
		Point start=new Point(StartX,StartY);
		
		press(driver,start,4000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Edit To-Do Task']")).click();
		driver.findElement(AppiumBy.id("com.app.todolist:id/tv_todo_list_deadline")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("android:id/next"))).click();
		
		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc='03 January 2026']")).click();	
		driver.findElement(AppiumBy.id("com.app.todolist:id/bt_deadline_ok")).click();
		
		driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();	
		String date=wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_exlv_task_deadline' and @text='Deadline: 03.01.2026']"))).getText();
		
		System.out.println(date);
		Assert.assertEquals(date,"Deadline: 03.01.2026"); 
	}
	
	
}
