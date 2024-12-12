package com.oopcw.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Matches all your API endpoints
                        .allowedOrigins("http://localhost:3000") // Replace with your frontend's URL
                        .allowedMethods("GET", "POST")
                        .allowedHeaders("*")
                        .allowCredentials(true); // Include if cookies or authorization headers are used
            }
        };
    }
}
