package com.flowerstone.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
		System.out.print("sadfasfsdfasdf");
	}
	@GetMapping("/")
	public String home() {
		return "home"; // home.html 또는 다른 뷰 페이지를 반환
	}
}
