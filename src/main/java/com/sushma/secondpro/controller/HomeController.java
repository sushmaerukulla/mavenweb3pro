package com.sushma.secondpro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/check")
    public ResponseEntity<String> checkUrl()
    {
        System.out.println("at check method");
        
      
        
         return new ResponseEntity<String>("sushma",HttpStatus.OK);

}
    @GetMapping("/hello")

    	public ResponseEntity<String> hellourl()
    	{
			return new ResponseEntity<String>("hellooooo",HttpStatus.OK);
    		
    	}
    }