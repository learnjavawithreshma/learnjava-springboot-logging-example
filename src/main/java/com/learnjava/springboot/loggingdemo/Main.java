package com.learnjava.springboot.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	
	private static Logger logger = LoggerFactory.getLogger(Main.class);

	  public static void main(String[] args) {
	        SpringApplication.run(Main.class, args);
	        logger.info("Hello World");
	    }

}
