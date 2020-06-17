package apiConfigs;

public class APIPath {
	
public static final class apiPath{
		
		//GET
		public static final String GET_LIST_OF_USERS ="api/users?page=2";
		public static final String GET_SINGLE_POST="posts/";
		
		//POST
		public static final String CREATE_POST="posts";
		
		
		//update post 
		public static final String UPDATE_POST="posts";
	}
public static void main(String[] args) {
	System.out.println(APIPath.apiPath.GET_LIST_OF_USERS);
}

}
