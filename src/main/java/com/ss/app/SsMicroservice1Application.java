package com.ss.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class })
public class SsMicroservice1Application {

	public static void main(final String[] args) {
		log.info("Starting application SsMicroservice {} ");
		SpringApplication.run(SsMicroservice1Application.class, args);
	}

}
