package com.gc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GcTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcTestingApplication.class, args);
	}

}

@RestController
@RequestMapping("/gc/hello-world")
class MainController{

	@GetMapping
	public ResponseEntity<String> helloWorld()
	{
		return ResponseEntity.ok("Hello world");
	}
}
