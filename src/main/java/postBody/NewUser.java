package postBody;

import apiConfigs.adminEndPoints;
import base.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewUser extends TestBase {


	public static String archiveUserPayLoad="[\"oCA4wF1QzJQyFEG5eBGZLXQq69G3\"]";

	public static String newUserPayLoad="{\"userName\":\"naushad78@gmail.com\",\"firstName\":\"Naushad\",\"lastName\":\"Alam\",\"birthDate\":\"03/02/1995\",\"roleType\":\"patient\",\"phone\":\"\",\"searchClinic\":\"\",\"city\":\"\",\"state\":\"\",\"passwords\":{\"password\":\"Nalam@85\",\"confirmPassword\":\"Nalam@85\"},\"password\":\"Nalam@85\",\"email\":\"naushad78@gmail.com\",\"clinicId\":\"963b4a49-97c2-49b5-8e64-16831348f3c6\"}";

	
	Response response = RestAssured.given()
			.body(NewUser.newUserPayLoad)
			.when()
			.post((prop.getProperty("ServerUrl") + adminEndPoints.apiPath.POST_CREATE_NEWUSER));
	
	String userId = response.getBody().jsonPath().getString("id");
	
	public static String deletePayLoad="[\r\n" + 
			"    {\r\n" + 
			"        \"avatarImg\": null,\r\n" + 
			"        \"currentSessionStart\": null,\r\n" + 
			"        \"disclaimerAcceptedDate\": null,\r\n" + 
			"        \"email\": \"naushad78@gmail.com\",\r\n" + 
			"        \"id\": +response.getBody().jsonPath().getString(\"id\")+,\r\n" + 
			"        \"firstName\": \"Naushad\",\r\n" + 
			"        \"lastName\": \"Alam\",\r\n" + 
			"        \"roleType\": \"patient\",\r\n" + 
			"        \"telehealthDelayed\": null,\r\n" + 
			"        \"clinicId\": \"963b4a49-97c2-49b5-8e64-16831348f3c6\",\r\n" + 
			"        \"telehealthStatus\": \"Available\",\r\n" + 
			"        \"entertainmentLocked\": true,\r\n" + 
			"        \"completedSurveys\": [],\r\n" + 
			"        \"completedVideos\": [],\r\n" + 
			"        \"birthDate\": \"1995-03-02\",\r\n" + 
			"        \"isChecked\": true\r\n" + 
			"    }\r\n" + 
			"]";
	
	public static String filterByAllRoleTypePayLoad="{\r\n" + 
			"    \"roleType\": [\r\n" + 
			"        \"physician\",\r\n" + 
			"        \"patient\",\r\n" + 
			"        \"admin\"\r\n" + 
			"    ],\r\n" + 
			"    \"userStatus\": [\r\n" + 
			"        \"active\",\r\n" + 
			"        \"inactive\"\r\n" + 
			"    ],\r\n" + 
			"    \"age\": {\r\n" + 
			"        \"min\": 0,\r\n" + 
			"        \"max\": 100\r\n" + 
			"    },\r\n" + 
			"    \"accessPoint\": [\r\n" + 
			"        \"Catheter\",\r\n" + 
			"        \"Fistula\"\r\n" + 
			"    ],\r\n" + 
			"    \"primaryLanguage\": [\r\n" + 
			"        \"Spanish\"\r\n" + 
			"    ]\r\n" + 
			"}";

	
	public static String filterByAdminPayLoad="{\r\n" + 
			"    \"roleType\": [\r\n" + 
			"        \"admin\"\r\n" + 
			"    ],\r\n" + 
			"    \"userStatus\": [\r\n" + 
			"        \"active\"\r\n" + 
			"    ],\r\n" + 
			"    \"age\": {\r\n" + 
			"        \"min\": 0,\r\n" + 
			"        \"max\": 100\r\n" + 
			"    },\r\n" + 
			"    \"accessPoint\": [\r\n" + 
			"        \"Catheter\"\r\n" + 
			"    ],\r\n" + 
			"    \"primaryLanguage\": [\r\n" + 
			"        \"English\"\r\n" + 
			"    ]\r\n" + 
			"}";
	
	public static String filterByPatientPayLoad="{\r\n" + 
			"    \"roleType\": [\r\n" + 
			"        \"patient\"\r\n" + 
			"    ],\r\n" + 
			"    \"userStatus\": [\r\n" + 
			"        \"active\",\r\n" + 
			"        \"inactive\"\r\n" + 
			"    ],\r\n" + 
			"    \"age\": {\r\n" + 
			"        \"min\": 0,\r\n" + 
			"        \"max\": 100\r\n" + 
			"    },\r\n" + 
			"    \"accessPoint\": [\r\n" + 
			"        \"Catheter\"\r\n" + 
			"    ],\r\n" + 
			"    \"primaryLanguage\": [\r\n" + 
			"        \"English\"\r\n" + 
			"    ]\r\n" + 
			"}";
	
	public static String filterByPhysicianPayLoad="{\r\n" + 
			"    \"roleType\": [\r\n" + 
			"        \"physician\"\r\n" + 
			"    ],\r\n" + 
			"    \"userStatus\": [\r\n" + 
			"        \"active\",\r\n" + 
			"        \"inactive\"\r\n" + 
			"    ],\r\n" + 
			"    \"age\": {\r\n" + 
			"        \"min\": 0,\r\n" + 
			"        \"max\": 100\r\n" + 
			"    },\r\n" + 
			"    \"accessPoint\": [\r\n" + 
			"        \"Catheter\",\r\n" + 
			"        \"Fistula\"\r\n" + 
			"    ],\r\n" + 
			"    \"primaryLanguage\": [\r\n" + 
			"        \"Spanish\"\r\n" + 
			"    ]\r\n" + 
			"}";


}
