package Q_AND_A.kh.com.utils;

public class UtilCommon {
	
	public static String datePatten  = "yyyyMMdd";
	
	public static String getEsc(){
		
		String strOsName = System.getProperty("os.name").toLowerCase();
        String m_strLF   = "";

        if( strOsName.indexOf("window") != -1 )
            m_strLF = "\r\n";
        else
            m_strLF = "\n";

		return m_strLF;
		
		
	}
	
	public static String getDate(){
		
		
		
		return "";
	}

}
