package in.priya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/")
	public String getMessage()
	{
		return "Welcome to Priya IT";
	}

}
