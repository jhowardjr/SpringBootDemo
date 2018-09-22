package com.example.SpringBootDemo.Configs

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
// Open class for spring boot
open class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Override
    override fun configure(http: HttpSecurity) {
        // Example of overriding security auto-configuration
        http.authorizeRequests().antMatchers("/").permitAll();
    }

}