package Q_AND_A.kh.com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QnAControllers {
	
	@RequestMapping(value = "/Article/teach", method = RequestMethod.GET)
	public String QnATeach(HttpServletRequest request){
		String path = request.getRequestURL().toString();
		System.out.println(" Helllo ========= "+path);
		return "/users/teach";
	}

}
