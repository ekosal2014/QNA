package Q_AND_A.kh.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Q_AND_A.kh.com.configuration.QAConfiguration;
import Q_AND_A.kh.com.utils.UtilCommon;
import Q_AND_A.kh.com.utils.UtilConfig;
import Q_AND_A.kh.com.utils.UtilConsts;
import Q_AND_A.kh.com.utils.UtilLogger;

@Controller
public class QnAControllers {
	
	 private static Logger logger  = Logger.getLogger(QAConfiguration.class);
	
	@RequestMapping(value = "/Article/teach", method = RequestMethod.GET)
	public String QnATeach(HttpServletRequest request){
		String path = request.getRequestURL().toString();
		System.out.println(" directorty :::: "+ System.getProperty("catalina.home"));
		logger.info(" Path ::::::::::: " + path );
		UtilLogger.log(UtilConfig.getValue(UtilConsts.LOG_FILE_USER), UtilConsts.LOG_FILE_USER_NAME , "조금만 더 있다 갈게요."+UtilCommon.getEsc());
		System.err.println(" Date :::: " + UtilCommon.getDate() + "  Date Time ::: " + UtilCommon.getDateTime());
		return "/users/teach";
	}

}
