package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private Integer id;
	private String name;
	private Double price;
	private Integer amount;
	private Boolean pub; // 出刊/停刊
	
}
