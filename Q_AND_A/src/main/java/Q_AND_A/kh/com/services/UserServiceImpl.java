package Q_AND_A.kh.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.mappers.UserMapper;
import Q_AND_A.kh.com.utils.UtilCommon;
import Q_AND_A.kh.com.utils.UtilConfig;
import Q_AND_A.kh.com.utils.UtilConsts;
import Q_AND_A.kh.com.utils.UtilException;
import Q_AND_A.kh.com.utils.UtilLogger;
import Q_AND_A.kh.com.utils.UtilMessage;


@Service
public class UserServiceImpl {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private PasswordEncoder passworEncoder;
	
	public UtilMessage inputUserInformation(UserInfo userInfo) throws UtilException{
		
		try{
			
			userInfo.setPassword(passworEncoder.encode(userInfo.getPassword()));
			userInfo.setSts( "1" );
			userInfo.setTxt( "1" );
			userInfo.setCreateby( "" );  
			userInfo.setCreatedt( UtilCommon.getDate()        );
			userInfo.setAction( "Create New User Information" );
			userMapper.inputUserInformation( userInfo );
			return new UtilMessage( "00000000", "successful"  );
			
		}catch(Exception e){
			
			UtilLogger.logErrorException(UtilConfig.getValue(UtilConsts.DIR_LOG_FILE_ERR), "userInf_insert_"+UtilCommon.getDateTime(), e);
			e.printStackTrace();
			throw new UtilException("00000000", "failure");

		}		

	}
	
	public UserInfo loadUserByUsername(String userName) throws UtilException{
		
		try{
			System.out.println("User Name ::=>  "+ userName);
			return userMapper.loadingUserByName(userName);
			
		}catch(Exception e){
			
			UtilLogger.logErrorException(UtilConfig.getValue(UtilConsts.DIR_LOG_FILE_ERR), "userInf_login_"+UtilCommon.getDateTime(), e);
			e.printStackTrace();
			throw new UtilException("99999999", "failure");
			
		}
		
		
	}
	
	

}
