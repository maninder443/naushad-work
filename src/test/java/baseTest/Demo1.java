package baseTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo1 {

	@Test
	public void postAPI() {
		RestAssured.baseURI="https://backend-dev-dot-davita-pilot.appspot.com";
		RestAssured.given().body("{\"userName\":\"k4@gmail.com\",\"firstName\":\"Mr\",\"lastName\":\"John\",\"birthDate\":\"03/02/1995\",\"roleType\":\"patient\",\"phone\":\"\",\"searchClinic\":\"\",\"city\":\"\",\"state\":\"\",\"passwords\":{\"password\":\"Nalam@85\",\"confirmPassword\":\"Nalam@85\"},\"password\":\"Nalam@85\",\"email\":\"k4@gmail.com\",\"clinicId\":\"ee46555d-46dd-488b-9447-2463f93bf829\"}")
		.post("/user")
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(201);
	}
}
