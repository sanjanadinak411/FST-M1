package project1;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Setup {

	String git_key="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";
	String sshkey;
	
	
	public RequestSpecification reqspec;
	public ResponseSpecification responsespec;
	
	@BeforeClass
	public void start() {
		
		reqspec=new RequestSpecBuilder()
				.addHeader("Content-Type", "application/json")
				.setBaseUri("https://api.github.com/user/keys")
				.build();
		
		responsespec=new ResponseSpecBuilder()
				.expectContentType("application/json")
				.build();
		
	}
	
	
	
}
