package com.example.demo.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Structure.GreetingS;

@RestController

public class GreetingC {

	public class GreetingController {
		
		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();
		
		@GetMapping("/greeting")
		public GreetingS greeting(@RequestParam(value = "name", defaultValue = "dear customer") String name) {
			return new GreetingS(counter.incrementAndGet(), String.format(template, name));
		}
	}

}
