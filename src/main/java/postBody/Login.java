package postBody;

import java.util.HashMap;
import java.util.Map;

public class Login {

	 public static String login = "{\r\n" + 
	 		"    \"email\": \"davita-pilot@mavenwave.com\",\r\n" + 
	 		"    \"password\": \"password\",\r\n" + 
	 		"    \"returnSecureToken\": true\r\n" + 
	 		"}";
	 
	 public static String inValidlogin = "{\r\n" + 
		 		"    \"email\": \"davita-pilot@mavenwave.com\",\r\n" + 
		 		"    \"password\": \"password123\",\r\n" + 
		 		"    \"returnSecureToken\": true\r\n" + 
		 		"}";
	

	/*
	 * public static String loginCredential() {
	 * 
	 * Map<String, Object> loginDetails = new HashMap<String, Object>();
	 * loginDetails.put("email", "davita-pilot@mavenwave.com");
	 * loginDetails.put("password", "password");
	 * loginDetails.put("returnSecureToken", "true"); return loginCredential(); }
	 */
}
	
