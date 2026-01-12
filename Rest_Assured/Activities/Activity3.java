package activities;

import java.util.HashMap;
import java.util.Map;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

@Test
public class Activity3 {

	RequestSpecification reqspec;
	ResponseSpecification responsespec;
	
	
	
	
	@BeforeClass
	public void setup(){
		
		reqspec=new RequestSpecBuilder()
		.addHeader("Content-Type", "application/json")
		.setBaseUri("https://petstore.swagger.io/v2/pet")
		.build();
				
		responsespec=new ResponseSpecBuilder()
		.expectStatusCode(200)
		.expectContentType("application/json")
		.expectBody("status", equalTo("alive"))
		.build();
					
	}
	@DataProvider(name = "petInfo")
	public Object[][] data_set() {
		
		Object[][] testData = new Object[][] { 
		    { 77232, "Riley", "alive"}, 
		    { 77233, "Hansel", "alive"} 
		};
		return testData;
				
	}
	
	@Test( priority=1, dataProvider = "petInfo")
	// Test case using a DataProvider
	public void addPets(int petId, String petName, String petStatus) {
		Map<String, Object> reqBody = new HashMap<>();
		reqBody.put("id", petId);
		reqBody.put("name", petName);
		reqBody.put("status", petStatus);
		
		given().spec(reqspec) // Use requestSpec
		.body(reqBody) // Send request body
		.when()
		.post() // Send POST request
		.then().spec(responsespec) // Assertions using responseSpec
		.body("name", equalTo(petName)); // Additional Assertion
	}
	
	@Test( priority=2, dataProvider = "petInfo")
	public void getPets(int petId, String petName, String petStatus) {
		given().spec(reqspec) // Use requestSpec
			.pathParam("petId", petId) // Add path parameter
			.log().all() // Log for request details
		.when()
			.get("/{petId}") // Send GET request
		.then().spec(responsespec) // Assertions using responseSpec
		    .body("name", equalTo(petName)) // Additional Assertion
		    .log().all(); // Log for request details
	}
	
	@Test(priority=3, dataProvider = "petInfo")
	public void deletePets(int petId, String petName, String petStatus) {
		given().spec(reqspec) // Use requestSpec
			.pathParam("petId", petId) // Add path parameter
		.when()
			.delete("/{petId}") // Send GET request
		.then()
			.body("code", equalTo(200))
			.body("message", equalTo(""+petId)); // Assertions using responseSpec
	}
	
}
