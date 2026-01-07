package stepDefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity1Steps extends Baseclass{
	

	@Given("user is on the TS homepage")
	public void navigation_method(){
		
		
		driver.get("https://training-support.net");
		
		
	}
	
	@When("the user clicks on the About Us link")
	public void click_method() {
		
		driver.findElement(By.linkText("About Us")).click();
		
	}
	
	@Then("they are redirected to another page")
	public void assert_method() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='About Us']")));
		
		Assertions.assertEquals(driver.getTitle(),"About Training Support");
	}
	
}
