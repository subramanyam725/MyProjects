package com.balu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:college.properties")
public class ConfigFile {
	
	@Bean
	public College collegeBean()
	{
		College col = new College();
		return col;
	}
	

}
