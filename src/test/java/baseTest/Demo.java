package baseTest;



import org.json.JSONObject;
import org.jsoup.helper.HttpConnection.Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import apiConfigs.patientEndPoints;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo {

	@Test
	public void RegistrationSuccessful()
	{	//https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPassword?key=AIzaSyDKNxo3LgKuufkkcFfNVOpqMlqXLZr8G20	
		
		RestAssured.baseURI ="https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPassword";
		
	 //   RestAssured.baseURI ="https://backend-dev-dot-davita-pilot.appspot.com";
	//	RequestSpecification request = RestAssured.given();
   
     // Add a header stating the Request body is a JSON
     //   request.header("authorization", "authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImMzZjI3NjU0MmJmZmU0NWU5OGMyMGQ2MDNlYmUyYmExMTc2ZWRhMzMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZGF2aXRhLXBpbG90IiwiYXVkIjoiZGF2aXRhLXBpbG90IiwiYXV0aF90aW1lIjoxNTkyNDc5MzI2LCJ1c2VyX2lkIjoiZ1B2ZXdzbjBLU2ZScFdFY1puVkZDcVZKazVOMiIsInN1YiI6ImdQdmV3c24wS1NmUnBXRWNablZGQ3FWSms1TjIiLCJpYXQiOjE1OTI0NzkzMjYsImV4cCI6MTU5MjQ4MjkyNiwiZW1haWwiOiJkYXZpdGEtcGlsb3QtZG9jdG9yLTNAbWF2ZW53YXZlLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJkYXZpdGEtcGlsb3QtZG9jdG9yLTNAbWF2ZW53YXZlLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6InBhc3N3b3JkIn19.AfXNLgS6fNZapHEZFXN5QemLREvmZ1__DRYRaTdLnmJqvnnXB4WYG-b75GyxS7h8D8cRRcjFGjNeaVzL7m6FWjiBJQU55YRn7EdromLCqRGI3zh7Yd4wO2JONeCRj_dI66XguZlRsLOlFwHRgrhNPlQUXDoswzpQyLmeyEDiPweD-SigotpR47v9yM1bxFi2aL_j1Zbq17olMZ5Ixqy3mhxiCmW9YYIuOI9KmgrwcUqDVVDriHdzhrThDwr1IOVK3vGCsTZ8oWZXtOJ0Lub_IsLEjBjBrwzagi_aSrmrhmVydWdf5Y2ljoUgp3y5dtGYdO6R6FDCqum45FunA2hjIQ");
      //  request.headers(new Header("Authorization", "Bearer" +"eyJhbGciOiJSUzI1NiIsImtpZCI6ImMzZjI3NjU0MmJmZmU0NWU5OGMyMGQ2MDNlYmUyYmExMTc2ZWRhMzMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZGF2aXRhLXBpbG90IiwiYXVkIjoiZGF2aXRhLXBpbG90IiwiYXV0aF90aW1lIjoxNTkyNTUzMTEyLCJ1c2VyX2lkIjoibEJncTRtWWNRbVVoZG9qQUp0OVVMNlE0MFhlMiIsInN1YiI6ImxCZ3E0bVljUW1VaGRvakFKdDlVTDZRNDBYZTIiLCJpYXQiOjE1OTI1NTMxMTIsImV4cCI6MTU5MjU1NjcxMiwiZW1haWwiOiJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6InBhc3N3b3JkIn19.kA_TucY7D1UIuTuCK5zbzW4NgWi68COxpOBWl2Drw7EerNdH_EsWH6uQyT_A2w1iRNsapyO1M8CGGyd9yiaOBE-iMHohDSh-q8M8lSPGmhQKuZJtjOPxzPwsb2cObGL6N-27eYCK3bsed-qlnTIQsdD3ODKSPak4DlD0ftKlPEFgPBQQx6T_up-EL84waEyhAh2KeK5sDUMuWRuuZFpwDNi3EM4wStxPLr2RU3m1sMzadzCkqJ_4mwTGzEbVhr8pmD3p3fk5lGkROBd2I4WQ8L8R1x8dIm4IhQvjIYrqDHrk_4fzaoODtjV7iCOQ9FP80yg9zRcZfizQcpRyb9YkJA"));
	
	// 	request.header( new Header("Authorisation","bearer"+ "eyJhbGciOiJSUzI1NiIsImtpZCI6ImMzZjI3NjU0MmJmZmU0NWU5OGMyMGQ2MDNlYmUyYmExMTc2ZWRhMzMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZGF2aXRhLXBpbG90IiwiYXVkIjoiZGF2aXRhLXBpbG90IiwiYXV0aF90aW1lIjoxNTkyNTUzMTEyLCJ1c2VyX2lkIjoibEJncTRtWWNRbVVoZG9qQUp0OVVMNlE0MFhlMiIsInN1YiI6ImxCZ3E0bVljUW1VaGRvakFKdDlVTDZRNDBYZTIiLCJpYXQiOjE1OTI1NTMxMTIsImV4cCI6MTU5MjU1NjcxMiwiZW1haWwiOiJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6InBhc3N3b3JkIn19.kA_TucY7D1UIuTuCK5zbzW4NgWi68COxpOBWl2Drw7EerNdH_EsWH6uQyT_A2w1iRNsapyO1M8CGGyd9yiaOBE-iMHohDSh-q8M8lSPGmhQKuZJtjOPxzPwsb2cObGL6N-27eYCK3bsed-qlnTIQsdD3ODKSPak4DlD0ftKlPEFgPBQQx6T_up-EL84waEyhAh2KeK5sDUMuWRuuZFpwDNi3EM4wStxPLr2RU3m1sMzadzCkqJ_4mwTGzEbVhr8pmD3p3fk5lGkROBd2I4WQ8L8R1x8dIm4IhQvjIYrqDHrk_4fzaoODtjV7iCOQ9FP80yg9zRcZfizQcpRyb9YkJA"));
	
		Response response = RestAssured.given().when()
				.queryParam("key", "AIzaSyDKNxo3LgKuufkkcFfNVOpqMlqXLZr8G20")
				.body("{\"email\":\"davita-pilot@mavenwave.com\",\"password\":\"password\",\"returnSecureToken\":true}")
				.log().all()
				.post();
		
//		Object token = response.getBody().jsonPath().get("idToken");
	//	System.out.println(token);
	//	request.header( new Header("Authorisation","bearer"+token));
	//	 String body = response.getBody().asString();
	//	 String headerValue = response.getHeader("headerName");
		
	/*	
		JSONObject requestParams = new JSONObject();
		
		requestParams.put("userName", "N11@gmail.com"); // Cast
		requestParams.put("firstName", "Mr.");
		requestParams.put("lastName", "John");
		requestParams.put("password", "Nalam@85");
		requestParams.put("confirmPassword", "Nalam@85");
		requestParams.put("roleType", "patient");
		requestParams.put("birthDate", "03/02/1995");
		requestParams.put("searchClinic",  "");
		
		request.body(requestParams.toString());
		
		
		Response response = request.post("/user");

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}*/
	
	}
}
	
