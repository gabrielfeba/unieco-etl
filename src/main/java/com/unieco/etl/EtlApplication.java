package com.unieco.etl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EtlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtlApplication.class, args);
	}

}
