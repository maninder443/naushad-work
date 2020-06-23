package DaVitaApiTest;

import static org.testng.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.patientEndPoints;
import apiVerifications.APIVerification;
import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import postBody.Login;

public class patientAPITestCases extends TestBase {

	@BeforeClass
	void setUp() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = prop.getProperty("baseURI");
		
		
	}

	@Test(priority = 1, enabled = true, description = "Validate valid login with username and password")
	final void validLogin() {

		test.log(LogStatus.INFO, "My test is starting from login......");

		Response response = RestAssured.given().contentType("application/json").accept("application/json")
				.body(Login.login).when().post(prop.getProperty("CONTEXT_PATH")).then()
				 .statusCode(200)
				 .contentType("application/json")
				.extract().response();
   //     System.out.println(response.then().log().all().statusCode(200));
        
		String idToken = response.jsonPath().getString("idToken");
		assertNotNull(idToken);
		response.header(idToken);
			
		Assert.assertEquals(response.getStatusCode(), 200);
	    String id = response.getBody().jsonPath().getString("localId");
	//	System.out.println(id);
		Assert.assertEquals(id, "lBgq4mYcQmUhdojAJt9UL6Q40Xe2");
	    Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
		 
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);

		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 2, enabled = false, description = "User activity by clicking on login")
	public void userActivity() {
		
		test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured.given().body("{}").when()
				.post(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.POST_USER_ACTIVITY);
		
		Assert.assertEquals(response.getStatusCode(), 201);	
	//	Assert.assertEquals(response.header("sec-fetch-mode"), "cors");
	//	Assert.assertEquals(response.header("content-type"), "application/json");
		
		APIVerification.responseTimeValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}

	

	@Test(priority = 4, enabled = true, description = "Validate total videos count under education menu of patient user")
	public void totalVideosCount() {
		
		test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured.given().when()
				.get(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.GET_TOTAL_VIDEOS_COUNT);
		
	//   System.out.println(	response.getBody().jsonPath().getInt("totalItemCount"));
		 Assert.assertEquals(response.getStatusCode(), 200);
	     Assert.assertEquals(response.getBody().jsonPath().getInt("totalItemCount"), 6);
		 Assert.assertEquals(response.header("content-type"), "application/json; charset=utf-8");
	     
		 APIVerification.responseTimeValidation(response);
		 APIVerification.responseJsonValidation(response);
		 
		/*
		 * // String key="firstName"; List<Object> userList =
		 * response.getBody().jsonPath().getList("firstName"); boolean individualUser =
		 * userList.contains("Naushad"); Assert.assertEquals(individualUser, true );
		 */

		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 5, enabled = true, description = "Validate percentage of Video play")
	public void percentOfVideoPlay() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		int percentOfCompletedVideo = 10;
		Response response = RestAssured.given().log().all()
				.body("{}").when()
				.post(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.POST_VIDEOS_PLAY+percentOfCompletedVideo);
		 
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.body().asString().contains("5a022c42-8257-404f-a071-29e7e36cba56") , true );	
		Assert.assertEquals(response.header("content-type"), "application/json; charset=utf-8");
		Assert.assertEquals(response.getBody().jsonPath().getString("id"), "lBgq4mYcQmUhdojAJt9UL6Q40Xe2");
		
	//	 System.out.println(response.getBody().jsonPath().getString("id"));
		 
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 6, enabled = true, description = "Validate survey details under patient")
	public void surveyDetails() {
		
		test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured.given().when()
				.get(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.GET_SURVEY_DETAILS);
		
		

			List<Object> serveyName = response.getBody().jsonPath().getList("name");
			boolean survey = serveyName.contains("Wellness Survey");
			 Assert.assertEquals(survey, true );
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.body().asString().contains("d79f4527-2387-4b43-ba45-d1fec23b76ed") , true );	
		Assert.assertEquals(response.header("content-type"), "application/json; charset=utf-8");
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
}
