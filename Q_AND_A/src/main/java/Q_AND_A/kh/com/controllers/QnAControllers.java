package Q_AND_A.kh.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Q_AND_A.kh.com.configuration.QAConfiguration;

@Controller
public class QnAControllers {
	
	 private static Logger logger  = Logger.getLogger(QAConfiguration.class);
	
	@RequestMapping(value = "/Article/teach", method = RequestMethod.GET)
	public String QnATeach(HttpServletRequest request){
		String path = request.getRequestURL().toString();
		System.out.println(" directorty :::: "+ System.getProperty("catalina.home"));
		logger.info(" Path ::::::::::: " + path );
		return "/users/teach";
	}

}
