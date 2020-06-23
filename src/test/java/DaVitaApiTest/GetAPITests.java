package DaVitaApiTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiConfigs.patientEndPoints;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest {
	

	@Test(priority = 1, enabled = true, description = "Validate list of users created under admin user")
	public void getAPIUsersList() {

	//	 RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS).then().log().all().statusCode(200);
		test.log(LogStatus.INFO, "My test is starting......");

		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS);

    //	int statusCode = response.getStatusCode();
	//	Assert.assertEquals(statusCode, "200");
	//	String successCode = response.jsonPath().get("SuccessCode");
	//	Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");

		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);

		test.log(LogStatus.INFO, "My test is ended......");

	}

	@Test(priority = 2, enabled = true, description = "Validate list of clinics connected to DaVita")
	public void getAPIClinicList() {

	//	 RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_CLINIC).then().log().all().statusCode(200);
		test.log(LogStatus.INFO, "My test is starting......");
		
	//	RestAssured.given().when().post(patientAPIPath.apiPath.POST_LOGIN).then().log().all().statusCode(201);
	//	RestAssured.given().when().get(patientAPIPath.apiPath.GET_PATIENT_USER).then().log().all().statusCode(200);
	//	RestAssured.given().when().get(patientAPIPath.apiPath.GET_TOTAL_VIDEOS_COUNT).then().log().all().statusCode(200);
	//	RestAssured.given().when().post(patientAPIPath.apiPath.POST_VIDEOS_PLAY).then().log().all().statusCode(201);
	
		
		

		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_CLINIC);

		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);

	//	  System.out.println(response.jsonPath().getList("$"));
				  //.jsonPath().prettify());
		// .asString());

//		  System.out.println(response.getStatusCode());

//		  System.out.println(response.getCookies());

//		  System.out.println(response.getTime());

		test.log(LogStatus.INFO, "My test is ended......");

		/*
		 * JSONArray array = new JSONArray(response.getBody().asString());
		 * 
		 * for(int i=0; i<array.length();i++) { System.out.println(array.get(i));
		 * 
		 * JSONObject obj = array.getJSONObject(i); System.out.println(obj.get("zip"));
		 * }
		 */

	}

	@Test(priority = 3, enabled = true, description = "Validate number of survey done by users")
	public void getAPISurveyList() {

		// RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_SURVEY).then().log().all().statusCode(200);

		test.log(LogStatus.INFO, "My test is starting......");
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_SURVEY);

		APIVerification.responseCodeValiddation(response, 200);
		APIVerification.responseTimeValidation(response);
		APIVerification.responseJsonValidation(response);
		test.log(LogStatus.INFO, "My test is ended......");
	}
}
