package net.ddhome.integration.spring.log4j2.splunk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@Autowired
	SpringLog4j2SplunkService springLog4j2SplunkService;
	
	@GetMapping("/home")
	public String welcome() {
		
		springLog4j2SplunkService.display();
		return "Logging splunk test";
		
	}

}
