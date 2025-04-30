package com.learning.config;

/*
 * If you want to use annotations like @Component, @Service, @Repository,@AutoWire etc.,
 * you need to enable component scanning using the @ComponentScan
 *
 * you doesn't need to create beans manually using @Bean annotation
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning") //
public class AppConfig2 {

}