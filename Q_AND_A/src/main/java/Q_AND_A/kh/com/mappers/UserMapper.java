package Q_AND_A.kh.com.mappers;

import org.apache.ibatis.annotations.Param;

import Q_AND_A.kh.com.domains.UserInfo;

public interface UserMapper {
	
	/**
	 * 
	 * @param  strName
	 * @return 
	 */
	public UserInfo loadingUserByName(@Param("strName") String strName);
}
