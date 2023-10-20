package com.akash.springboot.demo.myapp.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//	@Value("${coach.name}")
//	private String coachName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello ";
	}
}
