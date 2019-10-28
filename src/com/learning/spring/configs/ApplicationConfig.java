package com.learning.spring.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages= {"com.learning.spring.components.*"})
@Import({HibernateJavaConfig.class})
public class ApplicationConfig {}
