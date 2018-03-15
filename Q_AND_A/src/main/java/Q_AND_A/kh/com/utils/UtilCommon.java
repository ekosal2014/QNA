package Q_AND_A.kh.com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilCommon {
	
	static SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
	
	public static String getEsc(){
		
		String strOsName = System.getProperty("os.name").toLowerCase();
        String m_strLF   = "";

        if( strOsName.indexOf("window") != -1 )
            m_strLF = "\r\n";
        else
            m_strLF = "\n";

		return m_strLF;
		
		
	}
	
	/**
	 * 
	 * @return value : HHmmss
	 */
	public static String getTime(){
		return new SimpleDateFormat(UtilConsts.PATTERN_TIME).format(new Date());
	}
	/**
	 * 
	 * @return value : yyyyMMdd
	 */
	public static String getDate(){	
		
		return new SimpleDateFormat(UtilConsts.PATTERN_DATE).format(new Date());
		
	}
	
	/**
	 * 
	 * @return yyyyMMddHHmmss
	 */
	public static String getDateTime(){
		
		return new SimpleDateFormat(UtilConsts.PATTERN_DATE_TIME).format(new Date());
	}
	
	/**
	 * 
	 * @param time  = HHmmss
	 * @return     => HH:mm:ss 
	 */
	public static String getFormatTime(String time){	
		
		if ( time == null || time == "" ){
			return "";
		}		
		return new SimpleDateFormat(UtilConsts.PATTERN_FORMAT_DATE_TIME).format(time);
	}
	
	/**
	 * 
	 * @param date = yyyyMMdd
	 * @return    => yyyy-MM-dd
	 */
	
	public static String getFormatDate(String date){
		
		if ( date == null || date == "" ){
			return "";
		}		
		return new SimpleDateFormat(UtilConsts.PATTERN_FORMAT_DATE).format(date);
		
	}
	
	/**
	 * 
	 * @param dateTime = yyyyMMddHHmmss
	 * @return        => yyyy-MM-dd HH:mm:ss
	 */
	public static String getFormatDateTime(String dateTime){	
		
		if ( dateTime == null || dateTime == "" ){
			return "";
		}		
		return new SimpleDateFormat(UtilConsts.PATTERN_FORMAT_DATE_TIME).format(dateTime);
	}
	
	
	/**
	 * 
	 * @param source      = yyyyMMdd || HHmmss || yyyyMMddHHmmss
	 * @param patternFrom = basic form form source
	 * @param patternTo   = format to other form 
	 * @return
	 */	
	public static String getFormatToDateOrTime(String source, String patternFrom, String patternTo){
		
		Date           fmToDate = new Date();
		String           result = "";
		SimpleDateFormat dfFrom = new SimpleDateFormat(patternFrom);
		SimpleDateFormat dfTo   = new SimpleDateFormat(patternTo);
		try {
			
			fmToDate = dfFrom.parse(source);
			result   = dfTo.format(fmToDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return result;
	}
	
	

}
