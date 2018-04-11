package com.lucky.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloApplication {

	@RequestMapping("/Hello")
	@ResponseBody
	String homepage() {
		return "Hello Spring Developers!!";
	}

	@RequestMapping("/")
	@ResponseBody
	String hellopage() {
		return "Hello world!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
