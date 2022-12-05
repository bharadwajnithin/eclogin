package com.example.demonithin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demonithin")
public class DemonithinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemonithinApplication.class, args);
	}

}
