package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	// No Collections, No Arrays, No Strings, No Google
	public static int reverse(int original) {
		long reversedNum = 0;
		long input_long = original;
	
		while (input_long != 0) {
			reversedNum = reversedNum * 10 + input_long % 10;
			input_long = input_long / 10;
		}
	
		if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
			throw new IllegalArgumentException();
		}
		return (int) reversedNum;
	}
   
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Reversing number: 321 -> " + reverse(123));      // 321
		System.out.println("Reversing number: 404 -> " + reverse(404));      // 404
		System.out.println("Reversing number: 82736736 -> " + reverse(82736736)); // 63763728
		 
	}

}
