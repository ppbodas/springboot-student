package com.example.student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class,
				args);
	}

	@GetMapping
	public List<String> hello() {
		final ArrayList<String> strings = new ArrayList<>();
		strings.add("Hello");
		strings.add("World");
		strings.add("From Prathmesh");

		return strings;
	}
}
