package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/Demo")
public String suresh() {
	return "sir";
}
}
