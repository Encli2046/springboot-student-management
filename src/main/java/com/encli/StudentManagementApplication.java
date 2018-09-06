package com.encli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.encli.mapper")
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
}
