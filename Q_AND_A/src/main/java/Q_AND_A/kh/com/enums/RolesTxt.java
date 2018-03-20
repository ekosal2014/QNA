package Q_AND_A.kh.com.enums;

public enum RolesTxt {

	ROLE_USER("1"),
	ROLE_ADMIN("2")
	;
	
	private String value;
	
	private RolesTxt( String value ){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public static RolesTxt fromValue( String value ){
		for( RolesTxt role : RolesTxt.values() ){
			
			if ( role.value.equals(value)){
				return role;
			}
			
		}
		return null;
	}
	
	public static boolean contrains( String value ){
		for( RolesTxt role : RolesTxt.values() ){
			if ( role.value.equals(value) ){
				return true;
			}			
		}
		return false;
	}
	
	public String getLabel(){
		
		String label = "";
		if ("1".equals(value)){
			label = "USER";
		}else if ("2".equals(value)){
			label = "ADMIN";
		}
		
		return label;
	}
	
}
