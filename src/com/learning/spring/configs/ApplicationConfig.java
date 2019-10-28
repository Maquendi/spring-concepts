package com.learning.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.learning.spring.components.*"})
public class ApplicationConfig {

}
