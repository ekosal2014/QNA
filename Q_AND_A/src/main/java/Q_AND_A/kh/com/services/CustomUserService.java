package Q_AND_A.kh.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import Q_AND_A.kh.com.mappers.UserMapper;

@Service("customUerService")
public class CustomUserService implements UserDetailsService{
	
	@Autowired
	private UserMapper userMapper;
	
	public CustomUserService(){
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
