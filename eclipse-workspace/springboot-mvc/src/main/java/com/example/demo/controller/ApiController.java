package com.example.demo.controller;

import java.util.Map;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/api")
public class ApiController {
	
	// 執行路徑: http:localhost:8080/api/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello Springboot";
	}
	
	// 執行路徑: http:localhost:8080/api/hi
	@GetMapping("/hi")
	public String hi() {
		return "Hi Springboot";
	}
	
	// 執行路徑: http:localhost:8080/api/bmi?h=170&w=60
	@GetMapping("/bmi")
	public String bmi(@RequestParam(name = "h") double h, @RequestParam double w) {
		double bmi = w/ Math.pow(h/100, 2);
		return String.format("身高: %.1f 體重: %.1f bmi: %.2f", h, w, bmi);
	}
	
	// size = M, L, XL
	// sweet = 1~10分糖
	// M(20), L(35), XL(50)
	// 執行路徑: http:localhost:8080/api/beverage?size=M&sweet=1
	@GetMapping("/beverage")
	public String beverage(@RequestParam(required = false, defaultValue = "XL") String size,
			@RequestParam(required = false, defaultValue = "10") Integer sweet) {
		Map<String, Integer> price = Map.of("M", 20, "L", 35, "XL", 50);
		return String.format("飲料: %s杯, %d分糖, 價格: %d元", size, sweet, price.get(size));
	}
	
	
}
