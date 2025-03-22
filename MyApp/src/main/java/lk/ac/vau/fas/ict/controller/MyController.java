package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyController {
	
	@GetMapping("/name")
	public String myName() {
		return "I'm Nimna";
	}
	
	@GetMapping("/age")
	public String myAge() {
		return "Age : 23";
	}
	
	
	

}
