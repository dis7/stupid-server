package com.hasanain.stupidserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StupidServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StupidServerApplication.class, args);
	}

	@RestController
	public class StupidGuy {
		@GetMapping("/hello")
		public String hello() {
			return "hello\n";
		}
	}

}
