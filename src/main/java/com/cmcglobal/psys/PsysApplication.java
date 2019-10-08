package com.cmcglobal.psys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@MapperScan("com.cmcglobal.psys.core.mapper")
@EntityScan("com.cmcglobal.psys.core.domain")
public class PsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsysApplication.class, args);
	}

}
