package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-api")
public class TestController {
	
	@GetMapping("/report")
	public ResponseEntity<String> getData(){
		
		return new ResponseEntity<String>("hello gd mrng",HttpStatus.OK);
	}

}
