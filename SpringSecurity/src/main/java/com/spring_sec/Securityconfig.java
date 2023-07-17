package com.spring_sec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  
@EnableWebSecurity
public class Securityconfig implements WebMvcConfigurer {
	
    @Bean
     PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    
    @Bean
	public UserDetailsService userinfo() {
        

		UserDetails admin=User.builder()
				.username("user")
				.password(passwordEncoder().encode("123"))
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(admin);
		
	}

	
}
