package com.tieto.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExampleController {
	@RequestMapping("/show")
	public String show() {
		return "Hi Praveen ";
	}

}
