package com.bny.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

	@Bean
	public String someDummyBean1() {
		return "someDummyBean1";
	}
	
	@Bean
	public String someDummyBean2() {
		return "someDummyBean2";
	}

}
