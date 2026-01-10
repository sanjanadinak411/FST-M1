package activities;

import static org.hamcrest.CoreMatchers.equalTo;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Activity1 {

	String ROOT_URI = "https://petstore.swagger.io/v2/pet";
	  @Test
	  public void request_post() {
		  
		  String reqBody = "{\"id\": 77232, \"name\": \"Sunny\", \"status\": \"alive\"}";
		  
		  Response response = given()
			        .header("Content-Type", "application/json")    // Set headers
			        .body(reqBody).when().post(ROOT_URI);
				  
		  String body = response.getBody().asPrettyString();
		  System.out.println(body);
		  
		  response.then().body("id", equalTo(77232));
		  response.then().body("name", equalTo("Sunny"));
		  response.then().body("status", equalTo("alive"));
		  
	  }
	  @Test  
	public void request_get() {
		
		  Response response = given()
				  .header("Content-Type", "application/json")
				  .when()
				  .pathParam("petId", 77232)
				  .get(ROOT_URI+"/{petId}");
		  
		  response.then().body("id", equalTo(77232));
		  response.then().body("name", equalTo("Sunny"));
		  response.then().body("status", equalTo("alive"));
		  
	}
	  @Test 
	 public void request_del() {  
		 
		  Response response = given()
				  .header("Content-Type", "application/json")
				  .when()
				  .pathParam("petId", 77232)
				  .delete(ROOT_URI+"/{petId}");
		 
		  response.then().body("code", equalTo(200));
		  response.then().body("message", equalTo("77232"));
	 }
	  
}
	
	

