package apiConfigs;

public class APIPath {
	
public static final class apiPath{
		
		//GET
		public static final String GET_LIST_OF_USERS ="/user/all";
		public static final String GET_SINGLE_POST="/user";
		public static final String GET_LIST_OF_CLINIC ="/clinic/all";
		public static final String GET_LIST_OF_SURVEY ="/survey/all";
		
		//POST
		public static final String CREATE_POST="/user";
		
		
		//update post 
		public static final String UPDATE_POST="posts";
	}
public static void main(String[] args) {
	System.out.println(APIPath.apiPath.GET_LIST_OF_USERS);
}

}
