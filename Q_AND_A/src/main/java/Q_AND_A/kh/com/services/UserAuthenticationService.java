package Q_AND_A.kh.com.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Q_AND_A.kh.com.domains.Role;
import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.enums.RolesTxt;
import Q_AND_A.kh.com.mappers.UserMapper;

@Service("userAuthenticationService")
public class UserAuthenticationService implements UserDetailsService{
	
	@Autowired
	private UserMapper userMapper;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(" User Name ::: "+ username );
			
		UserInfo user = userMapper.loadingUserByName(username);
		
		if ( user == null ){
			throw new UsernameNotFoundException("username not found!");
		}
		
		List<Role> roles = userMapper.loadingRolesByName(username);
		List<Role> auth  = new ArrayList<>();
				
		for ( Role role : roles ){
		
			auth.add(new Role( role.getUser_role_id()
							 , role.getUsername()
							 , RolesTxt.fromValue(role.getRole()).toString())
							 );
			
		}
		
		user.setRoles(roles);

		return user;
	}

}
