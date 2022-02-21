package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.logic.ExcelToJsonConv;

@SpringBootApplication
public class FirstApplicationBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplicationBoot1Application.class, args);
		ExcelToJsonConv.excelToJsonConversion(args);
		
		
		
	}

}
