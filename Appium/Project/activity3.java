package project1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class activity3 extends Base{
	
	@Test(priority=0)
	public void method5() {

	driver.findElement(AppiumBy.xpath("(//android.widget.CheckBox[@resource-id='com.app.todolist:id/cb_task_done'])[1]")).click();
	driver.findElement(AppiumBy.xpath("(//android.widget.CheckBox[@resource-id='com.app.todolist:id/cb_task_done'])[2]")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.app.todolist:id/tv_exlv_task_name' and @text='Activity 3']")));
	Dimension dim=driver.manage().window().getSize();
	
	int StartX=(int) (0.40f* dim.getWidth());
	int StartY=(int) (0.30f* dim.getHeight());
	
	Point start=new Point(StartX,StartY);
	System.out.println(start);
	press(driver,start,4000);
	
	
	wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@resource-id='android:id/title' and @text='Edit To-Do Task']"))).click();
	
	int slideX=(int) (0.30f* dim.getWidth());
	int slideY=(int) (0.71f* dim.getHeight());
	
	Point drag_start=new Point(slideX,slideY);
	
	int endX=(int) (0.60f* dim.getWidth());
	int endY=(int) (0.71f* dim.getHeight());
	
	Point drag_end=new Point(endX,endY);
	
	wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.app.todolist:id/sb_new_task_progress"))).click();
	doSwipe(driver,drag_start,drag_end,4000);
	driver.findElement(AppiumBy.id("com.app.todolist:id/bt_new_task_ok")).click();	
	
	
}
	
	@Test(priority=1)
	public void method6() {
	
		driver.findElement(AppiumBy.accessibilityId("More options")).click();
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id='com.app.todolist:id/content'])[3]"))).click();
		
		
		List<WebElement> tasks=driver.findElements(AppiumBy.xpath("//android.widget.CheckBox[@resource-id='com.app.todolist:id/cb_task_done']"));
		Assert.assertEquals(tasks.size(),2); 
		
	} 
	
}
