package com.arya.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Here all the configurations will be done
 * @author Admin
 *
 */
@Configuration
@ImportResource("classpath:/spring.xml")
@EnableAsync
public class AppConfiguration {
	
}
