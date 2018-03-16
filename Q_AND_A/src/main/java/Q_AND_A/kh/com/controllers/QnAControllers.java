package Q_AND_A.kh.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Q_AND_A.kh.com.configuration.QAConfiguration;
import Q_AND_A.kh.com.domains.UserInfo;
import Q_AND_A.kh.com.services.UserServiceImpl;
import Q_AND_A.kh.com.utils.UtilCommon;
import Q_AND_A.kh.com.utils.UtilConfig;
import Q_AND_A.kh.com.utils.UtilConsts;
import Q_AND_A.kh.com.utils.UtilLogger;

@Controller
public class QnAControllers {
	
	 private static Logger log = LogManager.getLogger(QAConfiguration.class);
	
	 @Autowired
	 private UserServiceImpl userServiceImpl;
	 
	@RequestMapping(value = "/Article/teach", method = RequestMethod.GET)
	public String QnATeach(HttpServletRequest request){
		String path = request.getRequestURL().toString();
		UserInfo userInfo = new UserInfo();
		userServiceImpl.inputUserInformation(userInfo);
		
		return "/users/teach";
	}

}
