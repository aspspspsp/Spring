package com.zihan.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplicationStarter {
	private static final Logger logger = LoggerFactory.getLogger("Console");
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationStarter.class, args);
		logger.info("Demo Application has been started!");
	}
}
