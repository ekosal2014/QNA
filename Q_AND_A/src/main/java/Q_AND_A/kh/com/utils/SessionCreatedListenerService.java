package Q_AND_A.kh.com.utils;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Component
public class SessionCreatedListenerService  {

	@EventListener
	public void getUrl(ContextRefreshedEvent event){
		System.out.println("  :::::::::::: " + event);
	}
	
	/*@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(" All Event ::: " + event);
		if (event instanceof ContextRefreshedEvent) {
			System.out.println(" All Event ::: " + event);
            ApplicationContext applicationContext = ((ContextRefreshedEvent) event).getApplicationContext();
           // applicationContext.getBean(RequestMappingHandlerMapping.class).getHandlerMethods().forEach(null);
           final RequestMappingHandlerMapping requestMappingHandlerMapping =		applicationContext.getBean( RequestMappingHandlerMapping.class );
           final Map< RequestMappingInfo, HandlerMethod > handlerMethods =		requestMappingHandlerMapping.getHandlerMethods();
           System.out.println(" Url " + requestMappingHandlerMapping.getUrlPathHelper());
        }
	}*/

}
