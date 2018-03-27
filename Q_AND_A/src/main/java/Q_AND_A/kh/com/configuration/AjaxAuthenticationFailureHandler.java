package Q_AND_A.kh.com.configuration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import Q_AND_A.kh.com.utils.UtilMessage;

@Component("ajaxAuthenticationFailureHandler")
public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler{

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();		
		UtilMessage msg = new UtilMessage("99999999",exception.getMessage());
		String str = mapper.writeValueAsString(msg);
		response.getWriter().print(str);
		response.getWriter().flush();
	}

}
