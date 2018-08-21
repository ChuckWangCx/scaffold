package com.wcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wcx.mapper")
public class ScaffoldApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScaffoldApplication.class, args);
	}
}
