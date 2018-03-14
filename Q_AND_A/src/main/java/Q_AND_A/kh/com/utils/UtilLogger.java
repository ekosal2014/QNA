package Q_AND_A.kh.com.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UtilLogger {
	
	public static void log (String dir, String strName, String strMsg){
		
		FileWriter writer = null;
		
		try{
			
			    File file = new File(dir);
			    
			    if ( !file.exists() )
			    	  file.mkdirs();
			    
			    writer = new FileWriter(dir + strName + "_" + "20180314.log",true);
			    writer.write(strMsg);
			    writer.flush();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
						
				try {
					if ( writer != null ){
						writer.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	
	public static void log (String dir, String strMsg){
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
	}
}
