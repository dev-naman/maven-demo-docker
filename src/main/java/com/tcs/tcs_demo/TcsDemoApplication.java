package com.tcs.tcs_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TcsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcsDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello (){
		return "<h1>Hello Developers</h1>";
	}
	@PostMapping("/addition")
	 public int add(@RequestParam int a, @RequestParam int b){
		return a+b;
	}
}
