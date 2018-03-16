package Q_AND_A.kh.com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilConfig extends Properties{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static String     strName = ""  ;
	public static UtilConfig config  = null;
	
	public static UtilConfig getInstance(){
		if ( config == null ){			
			reload();
			
		}
		return config;
	}
	
	
	public static void load(String strName) throws IOException{
		
		if ( config == null){
			 config  = new UtilConfig();
			
			 FileInputStream in = null;
			 
			 try{				 
				 in = new FileInputStream(strName);
				 config.load(in);
								 
			 }catch(Exception e){				 
				 e.printStackTrace();
				 System.out.println(" Loading properties fail.");
				 
			 }finally {				
				 if ( in != null ){
					 in.close();
				 }
			}
			
		}
		
	}
	
	
	public static void reload(){		
		config = null;
		
		try{
			
			load(strName);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String getValue(String keyWord){
		
		if ( config == null ){
			reload();
		}
		
		if ( config.getProperty(keyWord) == null){
			return "";
		}else{
			return config.getProperty(keyWord);
		}
		
	}

}
