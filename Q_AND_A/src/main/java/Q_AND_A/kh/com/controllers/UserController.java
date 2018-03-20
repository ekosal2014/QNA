package Q_AND_A.kh.com.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.services.UserServiceImpl;
import Q_AND_A.kh.com.utils.UtilException;
import Q_AND_A.kh.com.utils.UtilMessage;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userSerivceImpl;

	@RequestMapping( value = "/article/registers" , method = RequestMethod.POST )
	public @ResponseBody UtilMessage userRegister(@RequestBody UserInfo info) throws UtilException {
		
		return userSerivceImpl.inputUserInformation(info);
		
	}
	
	
		
}
