package com.sample.twelvefactor.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // Instantiate Logger
    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfiguration.class);

    //Default Constructor
    public SecurityConfiguration(){
        super();
    }

    /**
     * This is a sample project, hence permitting everything and disabling csrf. Please do not try this in production unless security is handled
     * before hitting this service.
     * @param http
     */
    @Override
    protected void configure(HttpSecurity http){
        try {
            http.authorizeRequests().antMatchers("/").permitAll().and().cors().and().csrf().disable();
        }catch (Exception e){
            LOGGER.error("Class: SecurityConfiguration, method: configure --> is failed due to : " +e.getCause());
        }
    }
}
