package Q_AND_A.kh.com.utils;

public class UtilMessage {
	
	private String resultCd ;
	private String resultMsg;
	
	public UtilMessage(){
		this.resultCd  = "";
		this.resultMsg = "";
	}
	
	public UtilMessage( String resultCd, String resultMsg ){
		this.resultCd  = resultCd;
		this.resultMsg = resultMsg;
	}
	
	public String getResultCd() {
		return resultCd;
	}
	
	public void setResultCd(String resultCd) {
		this.resultCd = resultCd;
	}
	
	public String getResultMsg() {
		return resultMsg;
	}
	
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	

}
