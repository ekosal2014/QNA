package Q_AND_A.kh.com.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import Q_AND_A.kh.com.services.CustomAuthenticationProvider;

@Configuration
public class QASecurityconfig extends WebSecurityConfigurerAdapter{
	
	//@Autowired
	//private UserAuthenticationService userAuthenticationService;
	
	@Autowired
	private CustomAuthenticationProvider customAuthenticationProvider;
	
	@Autowired
	private AjaxAuthenticationFailureHandler ajaxAuthenticationFailureHandler;
	
	@Autowired
	private AjaxAuthenticationSuccessHandler ajaxAuthenticationSuccessHandler;
	
	@Autowired
	private CustomAccessDeniedHandler customAccessDeniedHandler;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
			    .antMatchers("/login").permitAll()
				.antMatchers("/userinfo/**").hasAnyRole("USER","ADMIN")
				.antMatchers("/admin/**").hasAnyRole("ADMIN")
			    //.antMatchers("/**").hasAnyRole("ADMIN")
				//.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.usernameParameter("username")
				.passwordParameter("password")
				//.failureUrl("/login?error")
				//.successForwardUrl("/")
				.successHandler(ajaxAuthenticationSuccessHandler)
				.failureHandler(ajaxAuthenticationFailureHandler)
				//.failureForwardUrl("/login")
				.permitAll()
			.and()
				.logout()
				.permitAll()
			.and()
			//.exceptionHandling().accessDeniedPage("/error/403");
			.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler);
	}
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(this.customAuthenticationProvider);
	}



	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
		web.ignoring().antMatchers("/static/**");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	

}
