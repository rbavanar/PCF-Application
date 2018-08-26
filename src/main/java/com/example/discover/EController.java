package com.example.discover;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {
@RequestMapping("/hello")
	public String welcome(){
		return "hi";
	}
}

