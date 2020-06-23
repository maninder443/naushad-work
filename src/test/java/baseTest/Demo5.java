package baseTest;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo5 {

	
@Test
public void oAuthToken() {

    Response res = RestAssured.given().
        auth().
        preemptive().basic("davita-pilot@mavenwave.com", "password").
        header("Content-Type","application/json").
        queryParam("key","AIzaSyDKNxo3LgKuufkkcFfNVOpqMlqXLZr8G20").
        formParam("localId","lBgq4mYcQmUhdojAJt9UL6Q40Xe2").
   //     formParam("client_secret","created an OAuth Client Secret_ID").
  //      formParam("grant_type","client_credentials").

        when().
        get("https://www.googleapis.com/identitytoolkit/v3/relyingparty/verifyPassword").

        //Getting this endpoint from JSON in OAuth Client ID as Token_URI created in google Cloud Platform

        then().assertThat().statusCode(200).extract().response();

        System.out.println("This is the response : " +res.asString());
}
}