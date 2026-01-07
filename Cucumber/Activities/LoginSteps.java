package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Baseclass{

	@Given("the user is on the login page")
	public void login_method(){
		
		driver.get("https://training-support.net/webelements/login-form");
		
	}
	
	@When("the user enters username and password")
	public void enter_creds() {
		
		WebElement element_1 = driver.findElement(By.xpath("//input[@id='username']"));
	    element_1.sendKeys("admin");
	    
	    WebElement element_2 = driver.findElement(By.xpath("//input[@id='password']"));
	    element_2.sendKeys("password");
		
	}
	
	@When("clicks the submit button")
	public void click_method() {
		
		WebElement element_3 = driver.findElement(By.xpath("//button[text()='Submit']"));
	    element_3.click();
		
	}
	
	@Then("get the confirmation message and verify it")
	public void assert_method() {
		
		Assertions.assertEquals(driver.getTitle(), "Selenium: Login Success!"); 
			
	}
	
	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String Usernames, String Passwords) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element_1 = driver.findElement(By.xpath("//input[@id='username']"));
	    element_1.sendKeys(Usernames);
	    
	    WebElement element_2 = driver.findElement(By.xpath("//input[@id='password']"));
	    element_2.sendKeys(Passwords);
	    
	}

	@Then("get the confirmation text and verify message as {string}")
	public void get_the_confirmation_text_and_verify_message_as(String expected) {
	    // Write code here that turns the phrase above into concrete actions
		String message = "invalid credentials";
		Assertions.assertEquals(message,expected);
	}
}
