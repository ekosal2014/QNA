package Q_AND_A.kh.com.configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import Q_AND_A.kh.com.domains.Role;
import Q_AND_A.kh.com.enums.RolesTxt;

@Component("ajaxAuthenticationSuccessHandler")
public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String targetUrl = determineTargetUrl(authentication);
		//System.out.println("User has been logged in successfully and redirect to " + targetUrl);
		/*if(response.isCommitted()){
			System.out.println("Response has already been committed. Unable to redirect to " + targetUrl);
			return;
		}
		*/
		//response.sendRedirect(targetUrl);
		response.getWriter().print(targetUrl);
		response.getWriter().flush();
		
	}
	
	/**
	 * This method extracts the roles of currently logged-in user and return
	 * appropriate URL according to user's role.
	 * @param authentication
	 * @return
	 */
	public String determineTargetUrl(Authentication authentication){
		
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		List<String> roles = new ArrayList<String>();
		
		for(GrantedAuthority authority: authorities){
			roles.add(authority.getAuthority());
		}
		
		
		if(roles.contains(RolesTxt.ROLE_ADMIN.toString())){
			return "/admin";
		}else if (roles.contains(RolesTxt.ROLE_USER.toString())){
			return "/user"; // Access Denied
		}else{
			return "/error/403"; // Access Denied
		}
	}

}
