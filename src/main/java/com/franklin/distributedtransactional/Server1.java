package com.franklin.distributedtransactional;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.franklin")
@ComponentScan("com.franklin")
public class Server1 {

	public static void main(String[] args) {
		SpringApplication.run(Server1.class, args);
	}

}
