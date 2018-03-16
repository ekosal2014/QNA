package Q_AND_A.kh.com.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UtilLogger {
	
	/**
	 * 
	 * @param dir     path directories that want to store log file
	 * @param strName Name of log file
	 * @param strMsg  Content that want to write into log file
	 */
	public static void log (String dir, String strName, String strMsg){
		
		FileWriter writer = null;
		
		try{
			
			    File file = new File(dir);
			    
			    if ( !file.exists() )
			    	  file.mkdirs();
			    System.out.println(" Path :: "+ dir);
			    writer = new FileWriter(dir + strName + ".log",true);
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
	
	
	/**
	 * 	
	 * @param dir    path directories that want to store log file
	 * @param strMsg Content that want to write into log file
	 */
	public static void log (String dir, String strMsg){
		
		try{
			FileWriter writer = null;
			
			try{
				
				    File file = new File(dir);
				    
				    if ( !file.exists() )
				    	  file.mkdirs();
				    System.out.println(" Path :: "+ dir);
				    writer = new FileWriter( dir + ".log",true);
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
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
	}
	
	public static void logErrorException(String dir, String strName, Exception e){
		
		try{
			
			String               message = "";
			StackTraceElement[] emlement = e.getStackTrace();
			
			message = e.getMessage() + UtilCommon.getEsc();
			
			for (int i = 0; i < emlement.length; i++ ){
				message += emlement[i].toString() + UtilCommon.getEsc();
			}
			 
			log( dir , strName , message );
						
		}catch( Exception  er ){
			er.printStackTrace();
		}
		
	}
}
