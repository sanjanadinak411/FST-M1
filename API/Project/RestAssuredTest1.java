package project1;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredTest1 extends Setup {
	
	
	int keyid;
	
	String reqbody= "{\"title\":\"TestAPIKey\", \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAINdywu+kt4LY/qSsLJpxaPuaj3xXKnrZ5JH0yAsCxxBS\"}";
	
	
	@Test(priority=1)
	public void post() {		


		keyid=
		given()
		.spec(reqspec)
		.auth().oauth2(git_key)
		.body(reqbody)
		.when()
		.post()
		.then()
		.statusCode(201)
		.extract()
		.path("id");
			
							
	
	//String resbody=response.getBody().asPrettyString();
	System.out.println(keyid);
	
	}
	
	
	@Test(priority=2, dependsOnMethods = "post")
	public void get() {
		
		
		given() // Use requestSpec
		.auth().oauth2(git_key)
		.pathParam("keyId",keyid) // Add path parameter
		.log().all() // Log for request details
	.when()
		.get("https://api.github.com/user/keys/{keyId}") // Send GET request
	.then().spec(responsespec) // Assertions using responseSpec
	    .body("id", equalTo(keyid)) // Additional Assertion
	    .log().all();	
		
		
	}
	
	@Test(priority=3, dependsOnMethods = {"post", "get"})
	public void delete() {
		
		given().spec(reqspec) // Use requestSpec
		.auth().oauth2(git_key)
		.pathParam("keyId",keyid) // Add path parameter
		.log().all() // Log for request details
	.when()
		.delete("/{keyId}") // Send delete request
	.then() // Assertions using responseSpec
	    .statusCode(204) // Additional Assertion
	    .log().all();	
		
		
	}
}
