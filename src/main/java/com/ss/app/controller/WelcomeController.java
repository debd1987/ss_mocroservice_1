package com.ss.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/apis/v1")
public class WelcomeController {

	@GetMapping("/welcome")
	public ResponseEntity<String> getHelloWorld() {
		log.info("Received call within welcome controller {}");
		return ResponseEntity.ok("Welcome to System Service Again!");
	}

}
