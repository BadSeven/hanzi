package com.hanzi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanzi.dao")
@EnableAutoConfiguration
public class HanziApplication {

	public static void main(String[] args) {
		SpringApplication.run(HanziApplication.class, args);
	}
}
