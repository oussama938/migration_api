package com.test.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.test.demo.services.TestService;

@SpringBootApplication


public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private TestService testService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Command Line Runner");
    }

}


