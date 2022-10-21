package com.vigil.automation.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity httpSecurity) throws Exception {
	  httpSecurity
		  .authorizeRequests()
		  .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
		  .anyRequest()
		  .fullyAuthenticated()
		  .and()
		  .httpBasic()
		  .and()
		  .csrf().disable();
   }

   @Bean
   public PasswordEncoder passwordEncoder() {
	  return new BCryptPasswordEncoder();
   }

   @Override
   public void configure(AuthenticationManagerBuilder authentication) throws Exception {
	  authentication.inMemoryAuthentication().withUser("vigil")
		  .password(passwordEncoder().encode("vigil@123")).authorities("ROLE_USER");
   }
}