package Q_AND_A.kh.com.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import Q_AND_A.kh.com.utils.UtilException;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Autowired
	private UserAuthenticationService userAuthenticationService;
	
	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String username = authentication.getName();
		String password = (String) authentication.getCredentials();
		UserDetails userInfor = this.userAuthenticationService.loadUserByUsername(username);
		
		if ( userInfor == null ){			
			throw new UsernameNotFoundException("username not found!");			
		}
		
		if ( !passwordEncoder.matches(password, userInfor.getPassword()) ){
			throw new UsernameNotFoundException("pass word not match!");
		}
		
		Collection< ? extends GrantedAuthority> authorities  = userInfor.getAuthorities();
		
		return new UsernamePasswordAuthenticationToken(userInfor, userInfor.getPassword(), authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

	
}
