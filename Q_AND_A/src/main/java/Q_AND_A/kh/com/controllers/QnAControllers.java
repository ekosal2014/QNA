package Q_AND_A.kh.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Q_AND_A.kh.com.configuration.QAConfiguration;
import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.services.UserServiceImpl;
import Q_AND_A.kh.com.utils.UtilException;

@Controller
public class QnAControllers {
	
	 private static Logger log = LogManager.getLogger(QAConfiguration.class);
	
	 @Autowired
	 private UserServiceImpl userServiceImpl;
	 
	@RequestMapping(value = "/article/teach", method = RequestMethod.GET)
	public String QnATeach(HttpServletRequest request) throws UtilException{
		String path = request.getRequestURL().toString();
		UserInfo userInfo = new UserInfo();
		userServiceImpl.inputUserInformation(userInfo);
		
		return "/users/teach";
	}
	
	@RequestMapping( value = "/login/auth" , method = RequestMethod.GET )
	public String checkPageLogin(ModelMap map){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if ( !auth.getPrincipal().equals("anonymousUser") ){
			
			UserInfo user = (UserInfo)auth.getPrincipal();
			map.put("userInfo", user);
			return "redirect:/";
			
		}
		return "login";
		
	}

}
