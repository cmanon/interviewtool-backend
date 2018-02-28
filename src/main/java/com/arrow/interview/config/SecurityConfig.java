package com.arrow.interview.config;

import com.arrow.interview.services.FakeUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private FakeUserDetailsService userDetailsService;

    @Override
    protected void configure (AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure (HttpSecurity httpSecurity) throws Exception {
        httpSecurity.httpBasic();
        httpSecurity.authorizeRequests()
                .antMatchers("/api").permitAll()
                .anyRequest()
                .authenticated();
        httpSecurity.csrf().disable();
    }
}
