package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;



import io.restassured.response.Response;

public class Activity2 {

	String ROOT_URI = "https://petstore.swagger.io/v2/user";
	
	@Test
	public void method_post() throws FileNotFoundException {
		
		FileInputStream inputJSON = new FileInputStream("C:\\Users\\SanjanaDinak\\Documents\\Automation\\java 2024\\FST_IBM\\activity2.json");
		  
		  Response response = given()
			        .header("Content-Type", "application/json")    // Set headers
			        .body(inputJSON).when().post(ROOT_URI);
				  
		  String body = response.getBody().asPrettyString();
		  System.out.println(body);
		  
		  response.then().body("code", equalTo(200));
		  response.then().body("message", equalTo("9900"));
		
	}
	
	@Test
	public void method2() throws IOException {
		
		
		File outputJSON = new File("C:\\Users\\SanjanaDinak\\Documents\\Automation\\java 2024\\FST_IBM\\activity2output.json");
		
		Response response = given()
		        .header("Content-Type", "application/json")    // Set headers
		        .pathParam("username", "sandy")
		        .when().get(ROOT_URI+"/{username}");
		
		String body = response.getBody().asPrettyString();
		  System.out.println(body);
		  
		  outputJSON.createNewFile();
		  FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(body);
			writer.close();
			
			response.then().body("id", equalTo(9900));
			response.then().body("username", equalTo("sandy"));
	}
	
	@Test
	public void method3() {
		
		Response response = given()
				  .header("Content-Type", "application/json")
				  .when()
				  .pathParam("username", "sandy")
				  .delete(ROOT_URI+"/{username}");
		
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("sandy"));
		
	}
	
	
	
}
