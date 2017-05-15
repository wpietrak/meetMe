package com.wojciechpietrak.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import com.wojciechpietrak.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
		
	@Autowired
	private UserService userService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.authorizeRequests()
			.antMatchers("/login").permitAll()
			.antMatchers("/meetings").permitAll()
			.antMatchers("/meeting/*").permitAll()
			.antMatchers("/register").permitAll()
			.antMatchers("/resources/**").permitAll()
			.antMatchers("/**").authenticated()
		.and()
		.formLogin()
			.usernameParameter("email")
			.passwordParameter("password")
			.loginPage("/login")
			.loginProcessingUrl("/login")
			
		.and()
		.csrf()
			.disable()
		.logout()
			.logoutUrl("/logout")
			.logoutSuccessUrl("/login?logout");

	}
}
