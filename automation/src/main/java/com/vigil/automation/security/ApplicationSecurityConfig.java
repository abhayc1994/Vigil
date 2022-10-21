package com.vigil.automation.security;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

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
   CorsConfigurationSource corsConfigurationSource() {
	  CorsConfiguration configuration = new CorsConfiguration();
	  configuration.setAllowedOrigins(Arrays.asList("https://vigil-be.herokuapp.com/"));
	  configuration.setAllowedMethods(
		  Arrays.asList("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS"));
	  configuration.setAllowedHeaders(
		  Arrays.asList("Access-Control-Allow-Headers", "Access-Control-Allow-Origin",
			  "Access-Control-Request-Method", "Access-Control-Request-Headers", "Origin",
			  "Cache-Control", "Content-Type"));
	  final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	  source.registerCorsConfiguration("/**", configuration);
	  return source;
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