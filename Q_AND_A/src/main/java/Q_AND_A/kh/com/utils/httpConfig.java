package Q_AND_A.kh.com.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationEvent;

public class httpConfig extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public httpConfig(HttpServletRequest req) {
		super(req);
		// TODO Auto-generated constructor stub
		String path = req.getRequestURL().toString();
		System.out.println(" url ::::: " + path);
	}

}
