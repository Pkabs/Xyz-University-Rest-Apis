package com.xyz.uni.rest.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XyzUniRestApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyzUniRestApisApplication.class, args);
	}
	/*
	 * @Bean public CommonsRequestLoggingFilter requestLoggingFilter() {
	 * CommonsRequestLoggingFilter loggingFilter = new
	 * CommonsRequestLoggingFilter(); loggingFilter.setIncludeClientInfo(true);
	 * loggingFilter.setIncludeQueryString(true);
	 * loggingFilter.setIncludePayload(true);
	 * loggingFilter.setIncludeHeaders(false); return loggingFilter; }
	 */

}
