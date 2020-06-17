package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
public HeaderConfigs() {
		
	}
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");

		return defalutHeaders;
		
	}
	
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IjRlMjdmNWIwNjllYWQ4ZjliZWYxZDE0Y2M2Mjc5YmRmYWYzNGM1MWIiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZGF2aXRhLXBpbG90IiwiYXVkIjoiZGF2aXRhLXBpbG90IiwiYXV0aF90aW1lIjoxNTkyMzEwNTA2LCJ1c2VyX2lkIjoiZ1B2ZXdzbjBLU2ZScFdFY1puVkZDcVZKazVOMiIsInN1YiI6ImdQdmV3c24wS1NmUnBXRWNablZGQ3FWSms1TjIiLCJpYXQiOjE1OTIzMTA1MDYsImV4cCI6MTU5MjMxNDEwNiwiZW1haWwiOiJkYXZpdGEtcGlsb3QtZG9jdG9yLTNAbWF2ZW53YXZlLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJkYXZpdGEtcGlsb3QtZG9jdG9yLTNAbWF2ZW53YXZlLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6InBhc3N3b3JkIn19.XRGTjgFw0LGwUof3ppR73bru36RO5DxmA2JhhOW-3VoRWXgtO1WEDPcASOLiuXIJiva64t4-TT18Wz2jUtLFz30W8MgXjU1WhmPOr3jGHeva0xwJgNhewAbYNNl5sUpMigYY8XaldSi-SztVyjuXE_pULiTwCz-XTwaZBPAVjagBF0reVnRhdcde9WF2HT4w7XJ8qpvk8waTcr7ROF7Smb21kAhbK90jWgbmV73QyHSAT8N_6IlhngJCMwGdg6Vv9F2-cUhpyGpy4mAvOGfDjkW0-o1QGe6ItrXC19hROj5JgjrlKKN_F2qdXx64THtzujDB80x0bFKorJeZxCs7yQ");

		
		return defalutHeaders;
		
	}
	
//	public Map<String, String> headersWithToken(){
//		Map<String, String> defalutHeaders = new HashMap<String, String>();
//		defalutHeaders.put("Content-Type", "application/json");
//		defalutHeaders.put("Acess_Token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
//		defalutHeaders.put("jwt_token", "sdjhvbshjdvbjhsdvbhjsdvbljhdsbv");
//		defalutHeaders.put("Tenet_user", "test");
//		
//		return defalutHeaders;
//		
//	}
	
	/*
	 * public static void main(String[] args) { HeaderConfigs hed=new
	 * HeaderConfigs(); System.out.println(hed.defaultHeaders()); }
	 */

}
