package DaVitaApiTest;

import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.adminEndPoints;
import apiConfigs.patientEndPoints;
import apiVerifications.APIVerification;
import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import postBody.Login;
import postBody.NewUser;

public class adminAPITestCases extends TestBase{


	@BeforeClass
	void setUp() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = prop.getProperty("baseURI");	
		
	}
	

	@Test(priority = 1, enabled = true, description = "Validate invalid login with username and password")
	final void invalidLogin() {

		test.log(LogStatus.INFO, "My test is starting from login......");

		Response response = RestAssured.given().contentType("application/json").accept("application/json")
				.body(Login.inValidlogin).when().post(prop.getProperty("CONTEXT_PATH")).then().
				extract().response();
		
	//	 System.out.println(response.then().log().all().statusCode(200));

		int status_code = response.getStatusCode();	
		Assert.assertEquals(status_code, 400);
		
	//	Assert.assertEquals(response.getStatusCode(), 400);
		Assert.assertEquals(response.body().asString().contains("INVALID_PASSWORD") , true );	
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=UTF-8");

		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 2, enabled = true, description = "Validate user login with valid username and password")
	final void validLogin() {

		test.log(LogStatus.INFO, "My test is starting from login......");

		Response response = RestAssured.given().contentType("application/json").accept("application/json")
				.body(Login.login).when().post(prop.getProperty("CONTEXT_PATH")).then().
		//		 statusCode(200).
				 contentType("application/json").
				extract().response();

		String idToken = response.getBody().jsonPath().getString("idToken");
		response.header(idToken);
		
		assertNotNull(idToken);		
		Assert.assertEquals(response.getStatusCode(), 200);
	    String id = response.getBody().jsonPath().getString("localId");
		System.out.println(id);
		Assert.assertEquals(id, "lBgq4mYcQmUhdojAJt9UL6Q40Xe2" );
	//	Assert.assertEquals(response.body().asString().contains("lBgq4mYcQmUhdojAJt9UL6Q40Xe2") , true );	
		Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");


		String email = response.getBody().jsonPath().getString("email");
		Assert.assertEquals(email, "davita-pilot@mavenwave.com" );
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	
	@Test(priority = 3, enabled = true, description = "Verify user and their details after login")
	public void adminUserDetails() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.when()
				.get(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.GET_ADMIN_USER_DETAILS);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		String email = response.getBody().jsonPath().getString("email");
		System.out.println(email);
		Assert.assertEquals(email , "davita-pilot-doctor-3@mavenwave.com" );
	//	Assert.assertEquals(response.body().asString().contains("davita-pilot-doctor-3@mavenwave.com") , true );	
		Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		

		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 4, enabled = true, description = "Validate create new user")
	public void createNewUser() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.body(NewUser.newUserPayLoad)
				.log().all()
				.when()
				.post((prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_CREATE_NEWUSER));
		
		Assert.assertEquals(response.getStatusCode(), 201);
		String email = response.getBody().jsonPath().getString("email");
		Assert.assertEquals(email , "naushad78@gmail.com");	
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 5, enabled = true, description = "Validate individual user present in the lists")
	public void alluserList() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.accept("application/json")
				.when()
				.get((prop.getProperty("ServerUrl") + adminEndPoints.apiPath.GET_ADMIN_ALL_USER_DETAILS));
		
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
		
	//	String key="firstName";
		List<Object> userList = response.getBody().jsonPath().getList("firstName");
		boolean individualUser = userList.contains("Naushad");
		 Assert.assertEquals(individualUser, true );
		 
		 APIVerification.responseTimeValidation(response);
		 APIVerification.responseJsonValidation(response);
		 
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 6, enabled = true, description = "Validate archive of user")
	public void archiveUser() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.body(NewUser.archiveUserPayLoad)
				.when()
				.post(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_ARCHIVE_USER);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Vary"), "Origin");
		
		
		APIVerification.responseTimeValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	} 
	
	
	
	@Test(priority = 7, enabled = true, description = "Validate clinic details")
    public void clinicDetails() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.when()
				.get(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.GET_ALL_CLINIC_DETAILS);
		

		Assert.assertEquals(response.getStatusCode(), 200);	
		Assert.assertEquals(response.header("Transfer-Encoding"), "chunked");
		
		List<Object> clinicList = response.getBody().jsonPath().getList("facilityname");
		boolean clinic = clinicList.contains("Hills Dialysis");
		 Assert.assertEquals(clinic, true );
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 8, enabled = true, description = "Validate created user deleted")
	 public void deleteUser() {
			
			test.log(LogStatus.INFO, "My test is starting......");
			
			Response response =  RestAssured.given()	
					.body(NewUser.deletePayLoad)
					.log().all()
					.when()
					.delete(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.DELETE_CREATED_USER);
			
			
			Response response2=	RestAssured.given()	
			        .log().all()
			        .when()
		        	.get(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.GET_ADMIN_ALL_USER_DETAILS);

			
			List<Object> userList = response2.getBody().jsonPath().getList("email");
			boolean individualUser = userList.contains("naushad78@gmail.com");
			 System.out.println(individualUser);
			 Assert.assertEquals(individualUser, true );
			
			Assert.assertEquals(response.getStatusCode(), 200);	
			Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
			Assert.assertEquals(response2.getStatusCode(), 200);
			APIVerification.responseTimeValidation(response);
			APIVerification.responseJsonValidation(response);
			
			test.log(LogStatus.INFO, "My test is ended......");
		}
	
	@Test(priority = 9, enabled = true, description = "Validate filter by admin and some other parameter")
    public void filterByAdmin() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.body(NewUser.filterByAdminPayLoad)
				.when()
				.post(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_FILTER_USER);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 10, enabled = true, description = "Validate filter by paient and some other parameter")
    public void filterByPatient() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.body(NewUser.filterByPatientPayLoad)
				.when()
				.post(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_FILTER_USER);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 11, enabled = true, description = "Validate filter by admin and some other parameter")
    public void filterByPhysician() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.body(NewUser.filterByPhysicianPayLoad)
				.when()
				.post(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_FILTER_USER);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	@Test(priority = 12, enabled = true, description = "Validate filter under admin")
    public void filterByCombineRoleType() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given()	
				.body(NewUser.filterByAllRoleTypePayLoad)
				.when()
				.post(prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_FILTER_USER);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.header("Content-Type"), "application/json; charset=utf-8");
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
	}
	
	
	

	@Test(priority = 13, enabled = true, description = "Validate total videos count under education menu of patient user")
	public void totalVideosCount() {
		
		test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured.given().when()
				.get(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.GET_TOTAL_VIDEOS_COUNT);
		
	//   System.out.println(response.getBody().jsonPath().getInt("totalItemCount"));
		 Assert.assertEquals(response.getStatusCode(), 200);
	     Assert.assertEquals(response.getBody().jsonPath().getInt("totalItemCount"), 6);
		 Assert.assertEquals(response.header("content-type"), "application/json; charset=utf-8");
	     
		 APIVerification.responseTimeValidation(response);
		 APIVerification.responseJsonValidation(response);

		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 14, enabled = true, description = "Validate percentage of Video play")
	public void VideoPlay() {
		
		test.log(LogStatus.INFO, "My test is starting......");
		int percentOfCompletedVideo = 20;
		Response response = RestAssured.given().log().all()
				.body("{}").when()
				.post(prop.getProperty("ServerUrl") + patientEndPoints.apiPath.POST_VIDEOS_PLAY+percentOfCompletedVideo);
		 
		
		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertEquals(response.body().asString().contains("5a022c42-8257-404f-a071-29e7e36cba56") , true );
		Assert.assertEquals(response.body().asString().contains("20") , true );
		Assert.assertEquals(response.header("content-type"), "application/json; charset=utf-8");
		
		
	//	 System.out.println(response.getBody().jsonPath().getString("id"));
		 
		
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		
		test.log(LogStatus.INFO, "My test is ended......");
	}

	@Test(priority = 15, enabled = true, description = "Validate survey details under patient")
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
