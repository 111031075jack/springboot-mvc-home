package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Water {
	private Integer weight; // 體重
	private Integer time; // 每日運動時間(分鐘)
	private Double recommand; // 每日建議飲水量
	private String advice; // 建議資訊
	
}
