package com.binara.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	private static final String RESOURCE_ID = "my_rest_api";

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId(RESOURCE_ID).stateless(false);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
//		http.
//		anonymous().disable()
//		.requestMatchers().antMatchers("/user/**")
//		.and().authorizeRequests()
////		.antMatchers("/user/**").access("hasRole('ADMIN')")
//				.regexMatchers(HttpMethod.GET, "/user/*")
//				.access("#oauth2.clientHasRole('ADMIN')")
//				.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());


//		http.antMatcher("/user/**").authorizeRequests().anyRequest().access("#oauth2.clientHasRole('ADMIN')");

//		http.authorizeRequests().antMatchers("/user/**").hasRole("ADMIN");

		http.authorizeRequests().anyRequest().authenticated().and().
                sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().
                csrf().disable();

//		http.authorizeRequests().antMatchers("/greet/**").hasRole("CUSTOMER");
//		http.authorizeRequests().antMatchers("/greet/**").hasAuthority("CUSTOMER");

	}

}