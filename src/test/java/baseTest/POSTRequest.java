package baseTest;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.patientEndPoints;
import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import postBody.Login;
import postBody.NewUser;


public class POSTRequest extends TestBase {
	
	private final String CONTEXT_PATH=prop.getProperty("CONTEXT_PATH");
 //	private final String CONTEXT_PATH="/identitytoolkit/v3/relyingparty/verifyPassword?key=AIzaSyDKNxo3LgKuufkkcFfNVOpqMlqXLZr8G20";
	//https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPassword?key=AIzaSyDKNxo3LgKuufkkcFfNVOpqMlqXLZr8G20
	
	  @BeforeClass
	  void setUp() {
		  RestAssured.useRelaxedHTTPSValidation();
	//	  RestAssured.baseURI="https://www.googleapis.com";
		  RestAssured.baseURI= prop.getProperty("baseURI");
	  
	  }
	 
	@Test(priority = 1, enabled = true, description = "Validate valid login with username and password")
	final void validLogin() {
		
		  Map<String, Object> loginDetails = new HashMap<String, Object>();
		  loginDetails.put("email", "davita-pilot@mavenwave.com");
		  loginDetails.put("password", "password");
		  loginDetails.put("returnSecureToken", "true");
		 
//		JSONObject json= new JSONObject();
//		json.put("email", "davita-pilot@mavenwave.com");
//		json.put("password", "password");
//		json.put("returnSecureToken", "true");
//	
		
		Response response=RestAssured.given().
		contentType("application/json").
		accept("application/json").
		body(Login.login).
		when().
		post(CONTEXT_PATH).
		then().
		statusCode(200).
		contentType("application/json").
		extract().
		response();
		
		String idToken= response.jsonPath().getString("idToken");
		assertNotNull(idToken);
	//	System.out.println(idToken);
	//	System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
	//	System.out.println(response.getHeaders());
		
	}
	
	
	@Test(priority = 2, enabled = false, description = "Validate patient details")
	public void patientDetailsAPI() {
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.when()
				.get("https://backend-staging-dot-davita-pilot.appspot.com/survey/all")
		         .then()
		.statusCode(200)
		.contentType("application/json")
		.extract()
		.response();
		

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
	//	String successCode = response.jsonPath().get("SuccessCode");
//		Assert.assertEquals("Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	
	//	System.out.println(successCode);
	//	System.out.println(response.getBody());
	//	System.out.println(response.getStatusLine());
	//	System.out.println(response.getHeaders());

	//	test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 3, enabled = false, description = "Validate patient details")
	public void createNewUserAPI() {
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.body(NewUser.newUserPayLoad)
				.when()
				.post("https://backend-staging-dot-davita-pilot.appspot.com/user")
		         .then()
		.statusCode(201)
		.contentType("application/json")
		.extract()
		.response();
		

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
	}
	
	
	
	@Test(priority = 4, enabled = true, description = "Validate patient details")
	public void alluserList() {
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.when()
				.get("https://backend-staging-dot-davita-pilot.appspot.com/user/all")
				
				;
				
				
				// Retrieve the body of the Response
				ResponseBody body = response.getBody();

				// To check for sub string presence get the Response body as a String.
				// Do a String.contains
				String bodyAsString = body.asString();
		//		Assert.assertEquals(bodyAsString.contains("naushad@gmail.com") /*Expected value*/, true /*Actual Value*/, "Response body contains unique emailID")
			
				Assert.assertEquals(response.body().asString().contains("naushad@gmail.com") , true );
				
				Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
				
	//	         .then()
	//	.statusCode(200)
		
		
	//	.contentType("application/json")
	//	.extract()
	//	.response()
		;
		

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
	//	Assert.assertEquals(statusCode, 200);
	}
	
	
	
	
	@Test(priority = 5, enabled = false, description = "Validate patient details")
	public void archiveUser() {
		
		Response response = RestAssured.given()	
				.body(NewUser.archiveUserPayLoad)
				.when()
				.post("https://backend-staging-dot-davita-pilot.appspot.com/user/disable")
		         .then()
		.statusCode(201)
		.extract()
		.response();
		

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
	}
	
}
