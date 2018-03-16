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
	/**
	 * 
	 * @param userInfo
	 * @return
	 * INSERT INTO qna_user_info
				(
				     full_name
				   , user_nickname
				   , username
				   , password
				   , sts
				   , txt
				   , create_by
				   , create_dt
				   , action
				)
		VALUES  (
				     #{full_name     }
				   , #{user_nickname }
				   , #{username      }
				   , #{password      }
				   , #{sts           }
				   , #{txt           }
				   , #{createby      }
				   , #{createdt      }
				   , #{action        }       					        
				)       	
	 */
	public int inputUserInformation(UserInfo userInfo);
}
