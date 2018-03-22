package Q_AND_A.kh.com.configuration;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@ComponentScan
@EnableAutoConfiguration
public class QAConfiguration extends WebMvcConfigurerAdapter{

	 private static Logger logger  = Logger.getLogger(QAConfiguration.class);
	 
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**")
				.addResourceLocations("/resources/");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/login/auth").setViewName("login");
		registry.addViewController("/article/register").setViewName("register");
		registry.addViewController("/userinfo/acticle").setViewName("users/acticle_add_new");
	}

	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setSuffix("classpath:/templates/Q&A/");
		resolver.setPrefix(".html");
		return resolver;
	}
	
}
