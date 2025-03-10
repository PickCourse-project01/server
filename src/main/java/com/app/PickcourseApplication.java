package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.app.pickcourse.mapper")
public class PickcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickcourseApplication.class, args);
	}

}
