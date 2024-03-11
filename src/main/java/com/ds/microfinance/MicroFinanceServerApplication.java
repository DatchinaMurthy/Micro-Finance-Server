package com.ds.microfinance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MicroFinanceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroFinanceServerApplication.class, args);
	}

}
