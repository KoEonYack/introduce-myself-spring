package com.example.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		long logTime = getCurrentTime();
		System.out.println("2021/01/29" + logTime);
		SpringApplication.run(WebdemoApplication.class, args);
		System.out.println("duration: " + (getCurrentTime() - logTime));
	}

	private static long getCurrentTime() {
		return new Date().getTime();
	}
}
