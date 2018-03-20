package Q_AND_A.kh.com.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import Q_AND_A.kh.com.domains.Role;
import Q_AND_A.kh.com.domains.UserInfo;

public interface UserMapper {
	
	/**
	 * 
	 * @param  strName
	 * @return 
	 */
	public UserInfo loadingUserByName(@Param("username") String username);
	/**
	 * 
	 * @param username
	 * @return
	 */
	public List<Role> loadingRolesByName(@Param("username") String username);
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
