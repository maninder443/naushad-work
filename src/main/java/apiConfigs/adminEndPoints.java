package apiConfigs;

public class adminEndPoints {

	public static final class apiPath{
		
			public static final  String GET_ADMIN_USER_DETAILS="/user";
			public static final  String GET_ADMIN_ALL_USER_DETAILS="/user/all";
			public static final  String GET_ALL_CLINIC_DETAILS="/clinic/all";
			
			//Post 
			
			public static final  String POST_FILTER_USER="/user/filter";			
			public static final  String POST_ARCHIVE_USER="/user/disable";			
			public static final  String POST_CREATE_NEWUSER="/user";
			
			//delete
			public static final String DELETE_CREATED_USER="/user";
			
	}

}
