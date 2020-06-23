package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {
public HeaderConfigs() {
		
	}
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
	//	defalutHeaders.put("Content-Type", "application/json");
	//	defalutHeaders.put("authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6ImMzZjI3NjU0MmJmZmU0NWU5OGMyMGQ2MDNlYmUyYmExMTc2ZWRhMzMiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL3NlY3VyZXRva2VuLmdvb2dsZS5jb20vZGF2aXRhLXBpbG90IiwiYXVkIjoiZGF2aXRhLXBpbG90IiwiYXV0aF90aW1lIjoxNTkyNDY2ODk1LCJ1c2VyX2lkIjoibEJncTRtWWNRbVVoZG9qQUp0OVVMNlE0MFhlMiIsInN1YiI6ImxCZ3E0bVljUW1VaGRvakFKdDlVTDZRNDBYZTIiLCJpYXQiOjE1OTI0NjY4OTUsImV4cCI6MTU5MjQ3MDQ5NSwiZW1haWwiOiJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwiZmlyZWJhc2UiOnsiaWRlbnRpdGllcyI6eyJlbWFpbCI6WyJkYXZpdGEtcGlsb3RAbWF2ZW53YXZlLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6InBhc3N3b3JkIn19.LMAS9zxXk5n83zvvbJSuJSXORAB8dJ4EJWfMa4cMiGY1tKcUipVcjEZDq3ku9Y1bonPp0CG2oKATjUUFchcyaPlZk0cEl33wo70jRBDqKxF0pQuLu-TMemO9PHnPvo0tRx2juv2SPvs6QPXCrQ9OhilPvavkpo3BqO9g9XcW9sIqjEajgbZCOAaKqktKvX7moX84vhfAsa7U9udBM-Rl1xO6YGC0XkrC5xILZBCyu0Nf8yxfQGMwAMWE13mOdx-1sob1HhUhVtVS-8xEBJrU2yDouym3B5_me5R_HGVGPaUFRga4qjyNcbPnTjjECfz68fWvsw6ya25YBzhZ9vWbCw");
		
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
