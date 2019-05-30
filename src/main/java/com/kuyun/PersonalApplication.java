package com.kuyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kuyun.mapper")
public class PersonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalApplication.class, args);
	}

}
