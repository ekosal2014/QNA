package Q_AND_A.kh.com.utils;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SessionCreatedListenerService implements ApplicationListener<httpConfig> {

	@Override
	public void onApplicationEvent(httpConfig arg0) {
		// TODO Auto-generated method stub
		System.out.println(" All Event ::: " + arg0);
	}

}
