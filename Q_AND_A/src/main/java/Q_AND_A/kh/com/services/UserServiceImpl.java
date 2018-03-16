package Q_AND_A.kh.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.mappers.UserMapper;
import Q_AND_A.kh.com.utils.UtilCommon;
import Q_AND_A.kh.com.utils.UtilConfig;
import Q_AND_A.kh.com.utils.UtilConsts;
import Q_AND_A.kh.com.utils.UtilLogger;


@Service
public class UserServiceImpl {
	
	@Autowired
	private UserMapper userMapper;
	
	public void inputUserInformation(UserInfo userInfo){
		
		try{
			userInfo.setSts( "1"     );
			userInfo.setTxt( "1"     );
			userInfo.setCreateby( "" );  
			userInfo.setCreatedt( UtilCommon.getDate()        );
			userInfo.setAction( "Create New User Information" );
			userMapper.inputUserInformation( userInfo );
			
		}catch(Exception e){
			
			UtilLogger.logErrorException(UtilConfig.getValue(UtilConsts.DIR_LOG_FILE_ERR), "userInf_insert_"+UtilCommon.getDateTime(), e);
			e.printStackTrace();
			
		}		

	}
	
	
	

}
