package com.b2c;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.b2c.dao*")
public class B2cOrderWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2cOrderWebApplication.class, args);
	}
}
