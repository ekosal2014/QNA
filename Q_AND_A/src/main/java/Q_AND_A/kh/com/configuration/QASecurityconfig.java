package Q_AND_A.kh.com.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class QASecurityconfig extends WebSecurityConfigurerAdapter{
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
				.failureUrl("/login?error")
				.successForwardUrl("/")
				//.successHandler(ajaxAuthenticationSuccessHandler)
				//.failureHandler(ajaxAuthenticationFailureHandler)
				//.failureForwardUrl("/login")
				.permitAll()
			.and()
				.logout()
				.permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/error/403");
			//.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
		web.ignoring().antMatchers("/static/**");
	}
	
}
