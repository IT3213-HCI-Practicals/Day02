package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class MyController1 {
	
	@GetMapping("/name")
	public String name(){
		return "Nimna Ruwandi";
	}
	
	@GetMapping("/regno")
	public String rno() {
		return "2020/ICT/88";
	}
	
	@GetMapping("/degree")
	public String degree() {
		return "Information Technology";
	}

}
