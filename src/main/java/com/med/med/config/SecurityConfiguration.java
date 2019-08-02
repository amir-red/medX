package com.med.med.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
 /*
 SecurityConfiguration is responsible for the security issues of the application
  */

@EnableWebSecurity // Enables Spring Security for the whole application
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //Disable Cross-site request forgery
        http.csrf().disable();

        //Url authentication allows all
        http.authorizeRequests()
                .antMatchers("/").permitAll();
    }

}
