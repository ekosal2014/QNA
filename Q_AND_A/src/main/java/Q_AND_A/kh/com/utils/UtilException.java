package Q_AND_A.kh.com.utils;

public class UtilException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCd;
	private String errorMsg;
	
	public UtilException(){
		this.errorCd = "";
		this.errorMsg= "";
	}
	
	public UtilException( String errorCd, String errorMsg ){
		this.errorCd = errorCd;
		this.errorMsg= errorMsg;
	}
	
	public String getErrorCd() {
		return errorCd;
	}
	
	public void setErrorCd(String errorCd) {
		this.errorCd = errorCd;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
	
	

}
