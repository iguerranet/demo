package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// No Collections, No Arrays, No Strings, No Google
	public static int reverse(int original) {
		int hundreds = original / 100;
		int i = original;
		i = original % 100;
		int tens =  (original) - (hundreds * 10);
		tens -=  (hundreds * 10);

		//System.out.println(i);
		 hundreds = original / 100;
		 tens =  original / 10;
		int singles =  original % 10;
		System.out.println(hundreds);
		System.out.println(tens);
		System.out.println(singles);
		return 0;
	}
   
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World");

		reverse(123);      // 321
		//reverse(404);      // 404
		//reverse(82736736); // 63763728
		 
	}

}
