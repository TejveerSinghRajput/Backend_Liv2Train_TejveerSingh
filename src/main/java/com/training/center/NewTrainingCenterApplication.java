package com.training.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NewTrainingCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewTrainingCenterApplication.class, args);

		System.out.println("<<<<<<<<<<<<<<<<<<<<< Center Service started >>>>>>>>>>>>>>>>>>>>>");
	}

}
