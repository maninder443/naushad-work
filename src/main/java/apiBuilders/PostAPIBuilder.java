package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuilder {

	public Map<String, String> postRequestBody(String email, String firstName, String lastName,String roleType, String clinicId, String birthDate) {
		Map<String, String> body = new HashMap<String, String>();

		body.put("userName", "N11@gmail.com"); // Cast
		body.put("firstName", "Mr.");
		body.put("lastName", "Alam");
		body.put("birthDate", "03/02/1995");
		body.put("password", "Nalam@85");
		body.put("confirmPassword", "Nalam@85");
		body.put("roleType", "patient");
		body.put("birthDate", "03/02/1995");
		body.put("searchClinic",  "");
	

		return body;

	}
}
