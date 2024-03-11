package com.aws.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class AwsDeploymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDeploymentsApplication.class, args);
	}

}
